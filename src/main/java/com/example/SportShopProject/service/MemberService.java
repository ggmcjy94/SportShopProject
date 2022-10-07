package com.example.SportShopProject.service;

import com.example.SportShopProject.domain.Member;
import com.example.SportShopProject.dto.RequestSaveMember;
import com.example.SportShopProject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class MemberService {
    private final MemberRepository memberRepository;


    public void newSaveMember(RequestSaveMember requestSaveMember) {
        memberRepository.save(new Member(requestSaveMember));
    }
}
