package com.example.SportShopProject.repository.mapper;

import com.example.SportShopProject.domain.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamMapper {
    void save(Team team);

    List<Team> findAll();

    Team findById(Long id);
}
