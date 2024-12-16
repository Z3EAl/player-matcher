package com.z3eai.playermatcher.controller;

import com.z3eai.playermatcher.error.GlobalExceptionHandler;
import com.z3eai.playermatcher.models.MatchJoinRequest;
import com.z3eai.playermatcher.persistence.Match;
import com.z3eai.playermatcher.service.MatchJoinService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchJoinService matchJoinService;

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @PostMapping(path = "/join")
    public ResponseEntity<?> join(@RequestBody MatchJoinRequest mjr, HttpServletResponse httpServletResponse) {
        try{
            matchJoinService.validateMatchJoin(mjr);
        } catch (IllegalArgumentException e) {
            return globalExceptionHandler.handleIllegalArgumentException(e);
        }
        Optional<Match> match = matchJoinService.joinMatch(mjr);
        return match.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PatchMapping(path = "/update")
    public ResponseEntity<Match> update(@RequestBody MatchJoinRequest mjr, HttpServletResponse httpServletResponse) {
        matchJoinService.validateMatchUpdate(mjr);
        Optional<Match> match = matchJoinService.updateMatch(mjr);
        return match.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
