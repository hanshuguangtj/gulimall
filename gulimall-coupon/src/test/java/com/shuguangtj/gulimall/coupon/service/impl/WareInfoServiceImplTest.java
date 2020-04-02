package com.shuguangtj.gulimall.coupon.service.impl;

import com.shuguangtj.gulimall.coupon.entity.WareInfoEntity;
import com.shuguangtj.gulimall.coupon.service.WareInfoService;
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
public class WareInfoServiceImplTest {

    @Autowired
    private WareInfoService wareInfoService;

    @Test
    public void save() {

        WareInfoEntity wareInfoEntity = new WareInfoEntity();
        wareInfoEntity.setAddress("湖北.武汉");

        wareInfoService.save(wareInfoEntity);
    }

}