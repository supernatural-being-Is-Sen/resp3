package cn.kgc.client.invoicingsystem;

import cn.kgc.pojo.invoicingsystem.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@FeignClient(name = "invoicing-system-provider")
public interface RestProductClient {

    /**
     * 查询所有商品
     * @return
     */
    @GetMapping("/product/findAll")
    List<Product> findAll();

    /**
     * 根据 id 获取库存信息
     * @param id
     * @return
     */
    @GetMapping("/product/getProductById/{id}")
    Product getProductById(@PathVariable Long id);
}
