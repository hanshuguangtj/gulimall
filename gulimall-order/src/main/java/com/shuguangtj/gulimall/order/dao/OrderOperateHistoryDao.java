package com.shuguangtj.gulimall.order.dao;

import com.shuguangtj.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 14:58:40
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
