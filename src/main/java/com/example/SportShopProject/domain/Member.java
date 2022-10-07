package com.example.SportShopProject.domain;

import com.example.SportShopProject.dto.RequestSaveMember;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private Long id;
    private String email;
    private String name;
    private String address;
    private String shopRole;

    private Long team_id;
    public Member(RequestSaveMember requestSaveMember) {
        this.email = requestSaveMember.getEmail();
        this.name = requestSaveMember.getName();
        this.address = requestSaveMember.getAddress();
        this.shopRole = requestSaveMember.getShopRole();
    }
}
