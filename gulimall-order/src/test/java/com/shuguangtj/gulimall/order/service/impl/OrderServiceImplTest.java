package com.shuguangtj.gulimall.order.service.impl;


import com.shuguangtj.gulimall.order.entity.OrderEntity;
import com.shuguangtj.gulimall.order.service.OrderService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administratoron 2020/4/2
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void save() {

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillContent("华为");
        orderService.save(orderEntity);
    }
}