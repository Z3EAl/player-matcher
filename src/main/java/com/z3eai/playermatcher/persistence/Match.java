package com.z3eai.playermatcher.persistence;

import com.z3eai.playermatcher.enums.MatchStatus;
import jakarta.persistence.*;


@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchID;
    @Column(nullable = false)
    private Long playerId;
    @Column(nullable = true)
    private Long opponentId;
    @Enumerated(EnumType.ORDINAL)
    private MatchStatus matchStatus;

    public Match() {
    }

    public Match(Long playerId, Long opponentId, MatchStatus matchStatus) {
        this.playerId = playerId;
        this.opponentId = opponentId;
        this.matchStatus = matchStatus;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchID=" + matchID +
                ", playerId=" + playerId +
                ", opponentId=" + opponentId +
                ", matchStatus=" + matchStatus +
                '}';
    }

    public Long getMatchID() {
        return matchID;
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

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }
}
