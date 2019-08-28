package com.offcn.sellergoods.service;

import com.offcn.entity.PageResult;
import com.offcn.pojo.TbBrand;

import java.util.List;

/**
 * Created by travelround on 2018/12/6.
 */
public interface BrandService {
    /**
     * 返回全部列表
     * @return
     */
    public List<TbBrand> findAll();
    public PageResult findPage(int pageNum, int pageSize);
}
