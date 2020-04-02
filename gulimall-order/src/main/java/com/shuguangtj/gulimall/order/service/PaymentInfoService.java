package com.shuguangtj.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuguangtj.common.utils.PageUtils;
import com.shuguangtj.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 14:58:40
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

