package com.example.SportShopProject.controller;

import com.example.SportShopProject.dto.RequestSaveShop;
import com.example.SportShopProject.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {
    private final ShopService shopService;

    @PostMapping
    public ResponseEntity<?> saveShopController(@RequestBody RequestSaveShop requestSaveShop){
        shopService.newShopMember(requestSaveShop);
        return ResponseEntity.ok().build();
    }
}
