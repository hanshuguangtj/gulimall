package com.shuguangtj.gulimall.member.dao;

import com.shuguangtj.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:08:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
