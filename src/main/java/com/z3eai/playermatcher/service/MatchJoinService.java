package com.z3eai.playermatcher.service;

import com.z3eai.playermatcher.enums.MatchStatus;
import com.z3eai.playermatcher.models.MatchJoinRequest;
import com.z3eai.playermatcher.persistence.Match;
import com.z3eai.playermatcher.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchJoinService {

    @Autowired
    MatchRepository matchRepository;

    public void validateMatchJoin(MatchJoinRequest request) {
        if(request==null){
            throw new IllegalArgumentException("MatchJoinRequest must not be null");
        }
        if (request.getPlayerId() == null) {
            throw new IllegalArgumentException("Player id must not be null");
        }
        if (request.getOpponentId() != null && request.getOpponentId().equals(request.getPlayerId())) {
            throw new IllegalArgumentException("Opponent ID must not be the same as Player ID");
        }
        //TODO: implement validation of template field
    }

    public Optional<Match> joinMatch(MatchJoinRequest request) {
        return Optional.of(matchRepository.save(new Match(request.getPlayerId(), request.getOpponentId(), MatchStatus.STARTED)));
    }

    public void validateMatchUpdate(MatchJoinRequest matchJoinRequest) {

    }

    public Optional<Match> updateMatch(MatchJoinRequest matchJoinRequest) {
        return null;
    }
}
