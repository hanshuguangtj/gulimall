package com.shuguangtj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuguangtj.common.utils.PageUtils;
import com.shuguangtj.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author shuguangtj
 * @email shuguangtj@gmail.com
 * @date 2020-04-02 15:04:24
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

