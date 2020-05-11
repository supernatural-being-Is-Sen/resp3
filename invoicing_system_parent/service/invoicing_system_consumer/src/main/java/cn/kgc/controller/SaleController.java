package cn.kgc.controller;

import cn.kgc.client.invoicingsystem.RestSaleClient;
import cn.kgc.commonbase.exceptionhandler.InvoicingSystemException;
import cn.kgc.pojo.invoicingsystem.Sale;
import cn.kgc.pojo.invoicingsystem.Users;
import cn.kgc.utils.Result;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private RestSaleClient restSaleClient;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 分页查询销售信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("findSaleInfoByPage/{pageNum}/{pageSize}/{sort}")
    public Result findSaleInfoByPage(@PathVariable long pageNum,
                                     @PathVariable long pageSize,
                                     @PathVariable String sort){
        return Result.success(this.restSaleClient.findSaleInfoByPage(pageNum,pageSize,sort));
    }

    /**
     * 新增销售
     * @param token
     * @param sale
     * @return
     */
    @PostMapping("addSale/{token}")
    public Result addSale(@PathVariable String token,
                          @RequestBody Sale sale){
        String userInfo = this.redisTemplate.boundValueOps(token).get();
        if(userInfo == null) {
            throw new InvoicingSystemException("您的信息已过期，请重新登录。");
        }
        Users user = JSON.parseObject(userInfo, Users.class);
        sale.setUserId(user.getId());
        return this.restSaleClient.addSale(sale) ? Result.success(null) : Result.error("添加失败");
    }
}
