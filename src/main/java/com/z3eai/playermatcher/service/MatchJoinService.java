package com.z3eai.playermatcher.service;

import com.z3eai.playermatcher.models.MatchJoinRequest;
import com.z3eai.playermatcher.repository.Match;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchJoinService {

    public void validateMatchJoin(MatchJoinRequest matchJoinRequest) {

    }

    public Optional<Match> JoinMatchWithRollback(MatchJoinRequest matchJoinRequest) {
        return null;
    }
}
