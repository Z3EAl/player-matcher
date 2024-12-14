package com.z3eai.playermatcher.controller;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.z3eai.playermatcher.models.MatchJoinRequest;
import com.z3eai.playermatcher.repository.Match;
import com.z3eai.playermatcher.service.MatchJoinService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchJoinService matchJoinService;

    @GetMapping(path = "/join")
    public ResponseEntity<Match> join(@RequestBody MatchJoinRequest mjr, HttpServletResponse httpServletResponse) {
        matchJoinService.validateMatchJoin(mjr);
        Optional<Match> match = matchJoinService.JoinMatchWithRollback(mjr);
        return match.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
