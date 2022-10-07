package com.example.SportShopProject.service;

import com.example.SportShopProject.domain.Team;
import com.example.SportShopProject.dto.RequestSaveTeam;
import com.example.SportShopProject.dto.ResponseTeam;
import com.example.SportShopProject.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    public void newSaveTeam(RequestSaveTeam requestSaveteam) {
        teamRepository.save(new Team(requestSaveteam));
    }

    public List<ResponseTeam> getAllTeams() {
        return teamRepository.findAll().stream().map(ResponseTeam::new).collect(Collectors.toList());
    }

    public ResponseTeam getByTeamId(Long id) {
        return new ResponseTeam(teamRepository.findById(id));
    }
}
