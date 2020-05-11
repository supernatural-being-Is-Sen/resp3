package cn.kgc.client.invoicingsystem;

import cn.kgc.pojo.invoicingsystem.Sale;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@FeignClient(name = "invoicing-system-provider")
public interface RestSaleClient {

    /**
     * 分页查询销售信息
     * @param pageNum
     * @param pageSize
     * @param sort
     * @return
     */
    @GetMapping("/sale/findSaleInfoByPage/{pageNum}/{pageSize}/{sort}")
    String findSaleInfoByPage(@PathVariable long pageNum,
                                   @PathVariable long pageSize,
                            @PathVariable String sort);

    /**
     * 新增销售
     * @param sale
     * @return
     */
    @GetMapping("/sale/addSale")
    boolean addSale(@RequestBody Sale sale);
}
