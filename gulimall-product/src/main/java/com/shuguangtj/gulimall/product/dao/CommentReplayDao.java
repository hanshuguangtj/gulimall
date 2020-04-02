package com.shuguangtj.gulimall.product.dao;

import com.shuguangtj.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:04:24
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
