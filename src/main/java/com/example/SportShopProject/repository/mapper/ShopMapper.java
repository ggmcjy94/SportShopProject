package com.example.SportShopProject.repository.mapper;

import com.example.SportShopProject.domain.Shop;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {


    void save(Shop shop);

}
