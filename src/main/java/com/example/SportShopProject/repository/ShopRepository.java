package com.example.SportShopProject.repository;

import com.example.SportShopProject.domain.Shop;
import com.example.SportShopProject.repository.mapper.ShopMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ShopRepository {

    private final ShopMapper shopMapper;

    public void save(Shop shop) {
        shopMapper.save(shop);
    }
}
