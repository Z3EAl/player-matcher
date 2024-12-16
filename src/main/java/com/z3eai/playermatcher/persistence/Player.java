package com.z3eai.playermatcher.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    Long playerID;
    String playerName;
    Integer playerRating;
    Long Score;

}
