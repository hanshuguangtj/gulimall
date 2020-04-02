package com.shuguangtj.gulimall.member.service.impl;

import com.shuguangtj.gulimall.member.entity.MemberEntity;
import com.shuguangtj.gulimall.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administratoron 2020/4/2
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceImplTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void save() {

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setCity("武汉");

        memberService.save(memberEntity);
    }

}