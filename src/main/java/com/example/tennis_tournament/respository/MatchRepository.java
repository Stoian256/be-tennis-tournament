package com.example.tennis_tournament.respository;

import com.example.tennis_tournament.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {}
