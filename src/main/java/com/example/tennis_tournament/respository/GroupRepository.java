package com.example.tennis_tournament.respository;

import com.example.tennis_tournament.model.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Groups, Long> {}

