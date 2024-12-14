package com.z3eai.playermatcher.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    Long PlayerID;
    String PlayerName;
    Integer PlayerRating;
    Long Score;

}
