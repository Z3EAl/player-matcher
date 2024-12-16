package com.z3eai.playermatcher.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    Long playerID;
    String playerName;
    Integer playerRating;
    Long Score;

}
