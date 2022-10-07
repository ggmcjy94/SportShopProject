package com.example.SportShopProject.repository.mapper;

import com.example.SportShopProject.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void save(Member member);

}
