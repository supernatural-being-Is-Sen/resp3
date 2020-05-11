package cn.kgc.controller;

import cn.kgc.pojo.invoicingsystem.Product;
import cn.kgc.service.ProductService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 吴雨森
 * @since 2020-05-10
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 查询所有商品
     * @return
     */
    @GetMapping("findAll")
    public List<Product> findAll(){
        return this.productService.list();
    }

    /**
     * 根据 id 获取库存信息
     * @param id
     * @return
     */
    @GetMapping("getProductById/{id}")
    public Product getProductById(@PathVariable Long id){
        return this.productService.getOne(new QueryWrapper<Product>()
        .lambda().eq(Product::getId,id));
    }
}

