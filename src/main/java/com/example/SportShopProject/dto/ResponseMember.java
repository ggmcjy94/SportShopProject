package com.example.SportShopProject.dto;

import com.example.SportShopProject.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMember {
    private Long id;
    private String email;
    private String name;
    private String address;
    private String shopRole;

    public ResponseMember(Member m) {
        id = m.getId();
        email = m.getEmail();
        name = m.getName();
        address = m.getAddress();
        shopRole = m.getShopRole();
    }
}
