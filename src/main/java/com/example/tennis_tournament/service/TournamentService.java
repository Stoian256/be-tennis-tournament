package com.example.tennis_tournament.service;

import com.example.tennis_tournament.model.Groups;
import com.example.tennis_tournament.model.Match;
import com.example.tennis_tournament.model.Tournament;
import com.example.tennis_tournament.respository.GroupRepository;
import com.example.tennis_tournament.respository.MatchRepository;
import com.example.tennis_tournament.respository.TournamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TournamentService {
    private final TournamentRepository tournamentRepository;
    private final GroupRepository groupRepository;
    private final MatchRepository matchRepository;

    public List<Tournament> findAll() {
        List<Tournament> tournaments = tournamentRepository.findAll();
        for (Tournament tournament : tournaments) {
            tournament.setNumberOfPlayers(calculateNumberOfPlayers(tournament));
        }
        return tournaments;
    }

    private int calculateNumberOfPlayers(Tournament tournament) {
        return tournament.getGroups().stream()
                .mapToInt(group -> group.getPositions().size())
                .sum();
    }

    public Tournament findById(Long id) {
        return tournamentRepository.findById(id).orElse(null);
    }


    public List<Groups> getGroups(Long tournamentId) {
        return groupRepository.findAll();
    }

    public List<Match> getMatches(Long tournamentId) {
        return matchRepository.findAll();
    }
}
