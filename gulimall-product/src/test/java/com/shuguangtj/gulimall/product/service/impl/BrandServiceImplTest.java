package com.shuguangtj.gulimall.product.service.impl;

import com.shuguangtj.gulimall.product.entity.BrandEntity;
import com.shuguangtj.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administratoron 2020/4/1
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandServiceImplTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void save() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("福特翼博");
        brandEntity.setName("福特翼博");

        brandService.save(brandEntity);
    }
}