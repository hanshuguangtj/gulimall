package com.shuguangtj.gulimall.product.dao;

import com.shuguangtj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:04:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
