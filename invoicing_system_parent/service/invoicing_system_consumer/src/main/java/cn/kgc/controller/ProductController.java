package cn.kgc.controller;

import cn.kgc.client.invoicingsystem.RestProductClient;
import cn.kgc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private RestProductClient restProductClient;

    /**
     * 查询所有商品
     * @return
     */
    @GetMapping
    public Result findAll(){
        return Result.success(this.restProductClient.findAll());
    }

    /**
     * 根据 id 获取库存信息
     * @param id
     * @return
     */
    @GetMapping("getProductById/{id}")
    public Result getProductById(@PathVariable Long id) {
        return Result.success(this.restProductClient.getProductById(id));
    }
}
