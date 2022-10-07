package com.example.SportShopProject.repository;

import com.example.SportShopProject.domain.Team;
import com.example.SportShopProject.dto.ResponseTeam;
import com.example.SportShopProject.repository.mapper.TeamMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TeamRepository {

    private final TeamMapper teamMapper;

    @Transactional
    public void save(Team team) {
        teamMapper.save(team);
    }

    public List<Team> findAll() {
        return teamMapper.findAll();
    }

    public Team findById(Long id) {
        return teamMapper.findById(id);
    }
}
