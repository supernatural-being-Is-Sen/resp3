package cn.kgc.controller;


import cn.kgc.pojo.invoicingsystem.Sale;
import cn.kgc.pojo.invoicingsystem.vo.SaleInfoVo;
import cn.kgc.service.SaleService;
import cn.kgc.utils.IdWorker;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 吴雨森
 * @since 2020-05-10
 */
@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private SaleService saleService;

    /**
     * 分页查询销售信息
     * @param pageNum
     * @param pageSize
     * @param sort
     * @return
     */
    @GetMapping("findSaleInfoByPage/{pageNum}/{pageSize}/{sort}")
    public String findSaleInfoPage(@PathVariable long pageNum,
                                   @PathVariable long pageSize,
                                   @PathVariable String sort){
        return JSON.toJSONString(this.saleService.findSaleInfoByPage(new Page<>(pageNum,pageSize),sort));
    }

    /**
     * 新增销售
     * @param sale
     * @return
     */
    @PostMapping("addSale")
    public boolean addSale(@RequestBody Sale sale){
        sale.setId(String.valueOf(idWorker.nextId()));
        System.out.println(sale.getId());
        sale.setSaleDate(LocalDate.now());
        BigDecimal quantity = new BigDecimal(sale.getQuantity().toString());
        BigDecimal totalPrice = sale.getPrice().multiply(quantity);
        sale.setTotalPrice(totalPrice);
        return this.saleService.save(sale);
    }
}

