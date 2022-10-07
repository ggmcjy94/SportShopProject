package com.example.SportShopProject.service;

import com.example.SportShopProject.domain.Shop;
import com.example.SportShopProject.dto.RequestSaveShop;
import com.example.SportShopProject.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopService {
    private final ShopRepository shopRepository;

    public void newShopMember(RequestSaveShop requestSaveShop) {

        shopRepository.save(new Shop(requestSaveShop));
    }
}
