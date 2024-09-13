package com.be.moduleapi.service;

import com.be.moduleapi.exception.CustomException;
import com.be.modulecommon.domain.Member;
import com.be.modulecommon.enums.CodeEnum;
import com.be.modulecommon.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    @Value("${profile-name}")
    private String profileName;

    private final MemberRepository memberRepository;

    public String save() {
        System.out.println("name:" + profileName);

        memberRepository.save(Member.builder()
                .name(Thread.currentThread().getName())
                .build());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }
}
