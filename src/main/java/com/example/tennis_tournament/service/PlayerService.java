package com.example.tennis_tournament.service;

import com.example.tennis_tournament.model.Player;
import com.example.tennis_tournament.respository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository repository;

    public List<Player> findAll() {
        return repository.findAll();
    }

    public Player findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
