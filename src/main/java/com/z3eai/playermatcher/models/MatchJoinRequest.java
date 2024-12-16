package com.z3eai.playermatcher.models;

import com.z3eai.playermatcher.persistence.MatchTemplate;

public class MatchJoinRequest {
    MatchTemplate matchTemplate;
    Long playerId;
    Long opponentId;

    public MatchJoinRequest(MatchTemplate matchTemplate, Long playerId, Long opponentId) {
        this.matchTemplate = matchTemplate;
        this.playerId = playerId;
        this.opponentId = opponentId;
    }

    public MatchTemplate getMatchTemplate() {
        return matchTemplate;
    }

    public void setMatchTemplate(MatchTemplate matchTemplate) {
        this.matchTemplate = matchTemplate;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getOpponentId() {
        return opponentId;
    }

    public void setOpponentId(Long opponentId) {
        this.opponentId = opponentId;
    }
}
