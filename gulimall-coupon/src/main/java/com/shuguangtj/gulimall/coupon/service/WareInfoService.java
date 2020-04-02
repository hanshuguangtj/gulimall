package com.shuguangtj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuguangtj.common.utils.PageUtils;
import com.shuguangtj.gulimall.coupon.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:15:48
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

