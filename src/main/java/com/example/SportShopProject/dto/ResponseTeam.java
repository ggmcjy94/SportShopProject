package com.example.SportShopProject.dto;

import com.example.SportShopProject.domain.Member;
import com.example.SportShopProject.domain.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTeam {
    private Long id;
    private String name;
    private List<ResponseMember> members;

    public ResponseTeam(Team team) {
        id = team.getId();
        name = team.getName();
        members = team.getMembers().stream().map(m -> new ResponseMember(m)).collect(Collectors.toList());
    }
}
