package com.z3eai.playermatcher.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MatchTemplate {
    @Id
    Long templateId;
    String templateName;
    Integer gameId;
}
