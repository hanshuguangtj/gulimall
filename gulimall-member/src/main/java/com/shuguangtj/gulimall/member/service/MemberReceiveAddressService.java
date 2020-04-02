package com.shuguangtj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuguangtj.common.utils.PageUtils;
import com.shuguangtj.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:08:14
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

