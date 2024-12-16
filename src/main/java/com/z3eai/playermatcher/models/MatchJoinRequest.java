package com.z3eai.playermatcher.models;

import com.z3eai.playermatcher.persistence.MatchTemplate;
import lombok.Data;

@Data
public class MatchJoinRequest {
    MatchTemplate matchTemplate;
    Long playerId;
    Long opponentId;

    public MatchJoinRequest(MatchTemplate matchTemplate, Long playerId, Long opponentId) {
        this.matchTemplate = matchTemplate;
        this.playerId = playerId;
        this.opponentId = opponentId;
    }
}
