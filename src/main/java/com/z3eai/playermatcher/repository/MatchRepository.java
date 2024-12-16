package com.z3eai.playermatcher.repository;

import com.z3eai.playermatcher.persistence.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByMatchID(Long matchID);
}
