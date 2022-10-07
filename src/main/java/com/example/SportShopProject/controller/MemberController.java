package com.example.SportShopProject.controller;


import com.example.SportShopProject.dto.RequestSaveMember;
import com.example.SportShopProject.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<?> saveMemberController(@RequestBody RequestSaveMember requestSaveMember) {
        memberService.newSaveMember(requestSaveMember);
        return ResponseEntity.ok().build();
    }
}
