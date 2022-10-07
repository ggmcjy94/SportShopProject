package com.example.SportShopProject.domain;

import com.example.SportShopProject.dto.RequestSaveShop;
import lombok.Getter;

@Getter
public class Shop {

    private Long id;
    private String shopName;
    private Long member_id;

    public Shop(RequestSaveShop requestSaveShop) {
        this.shopName = requestSaveShop.getShopName();
        this.member_id = requestSaveShop.getMember_id();
    }
}
