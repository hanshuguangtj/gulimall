package com.shuguangtj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuguangtj.common.utils.PageUtils;
import com.shuguangtj.gulimall.coupon.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:15:48
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

