package com.example.SportShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestSaveMember {

    private String email;
    private String name;
    private String address;
    private String shopRole;
}
