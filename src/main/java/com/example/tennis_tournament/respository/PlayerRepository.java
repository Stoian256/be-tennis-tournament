package com.example.tennis_tournament.respository;

import com.example.tennis_tournament.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {}

