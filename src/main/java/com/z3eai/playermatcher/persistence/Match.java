package com.z3eai.playermatcher.persistence;

import com.z3eai.playermatcher.enums.MatchStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long matchID;
    @Column(nullable = false)
    Long playerId;
    @Column(nullable = true)
    Long opponentId;
    @Enumerated(EnumType.ORDINAL)
    MatchStatus matchStatus;

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
