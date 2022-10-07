package com.example.SportShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestSaveShop {

    private String shopName;
    private Long member_id;
}
