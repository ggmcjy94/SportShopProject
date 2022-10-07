package com.example.SportShopProject.domain;

import com.example.SportShopProject.dto.RequestSaveTeam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    private Long id;
    private String name;

    private List<Member> members;
    public Team(RequestSaveTeam requestSaveteam) {
        this.name = requestSaveteam.getName();
    }
}
