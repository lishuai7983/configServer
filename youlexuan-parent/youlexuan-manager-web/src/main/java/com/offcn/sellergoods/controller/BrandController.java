package com.offcn.sellergoods.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.entity.PageResult;
import com.offcn.pojo.TbBrand;
import com.offcn.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by travelround on 2018/12/6.
 */
// @RestController注解，相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面
@RestController
@RequestMapping("/brand")
public class BrandController {
    // @reference也是注入，但是一般用来注入分布式的远程服务对象，需要配合dubbo配置使用
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows){
        System.out.println("bbb");
        PageResult page1 = brandService.findPage(page, rows);
        System.out.println("aaaa" + page1);
        return page1;
    }
}
