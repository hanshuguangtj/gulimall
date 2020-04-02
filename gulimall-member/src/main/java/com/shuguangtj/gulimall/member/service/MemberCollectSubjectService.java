package com.shuguangtj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuguangtj.common.utils.PageUtils;
import com.shuguangtj.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:08:14
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

