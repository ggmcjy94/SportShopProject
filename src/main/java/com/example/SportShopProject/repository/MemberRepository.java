package com.example.SportShopProject.repository;

import com.example.SportShopProject.domain.Member;
import com.example.SportShopProject.repository.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberRepository {

    private final MemberMapper memberMapper;

    @Transactional
    public void save (Member member) {
        memberMapper.save(member);
    }

}
