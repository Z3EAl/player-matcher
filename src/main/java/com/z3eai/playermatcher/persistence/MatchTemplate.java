package com.z3eai.playermatcher.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MatchTemplate {
    @Id
    Long templateId;
    String templateName;
    Integer gameId;
}
