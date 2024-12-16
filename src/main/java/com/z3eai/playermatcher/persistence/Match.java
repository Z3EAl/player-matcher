package com.z3eai.playermatcher.persistence;

import com.z3eai.playermatcher.enums.MatchStatus;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
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
}
