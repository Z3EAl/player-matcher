package com.z3eai.playermatcher.models;

import com.z3eai.playermatcher.persistence.MatchTemplate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchJoinRequest {
    MatchTemplate matchTemplate;
    Long playerId;
    Long opponentId;
}
