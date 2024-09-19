package com.example.tennis_tournament.controller;

import com.example.tennis_tournament.model.Groups;
import com.example.tennis_tournament.model.Match;
import com.example.tennis_tournament.model.Tournament;
import com.example.tennis_tournament.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tournaments")
public class TournamentController {
    private final TournamentService tournamentService;

    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.findAll();
    }

    @GetMapping("/{id}")
    public Tournament getTournamentById(@PathVariable Long id) {
        return tournamentService.findById(id);
    }


    @GetMapping("/{id}/groups")
    public List<Groups> getGroups(@PathVariable Long id) {
        return tournamentService.getGroups(id);
    }

    @GetMapping("/{id}/matches")
    public List<Match> getMatches(@PathVariable Long id) {
        return tournamentService.getMatches(id);
    }
}