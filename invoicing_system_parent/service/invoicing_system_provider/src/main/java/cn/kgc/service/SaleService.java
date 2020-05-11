package cn.kgc.service;

import cn.kgc.pojo.invoicingsystem.Sale;
import cn.kgc.pojo.invoicingsystem.vo.SaleInfoVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 吴雨森
 * @since 2020-05-10
 */
public interface SaleService extends IService<Sale> {

    /**
     * 查询销售信息
     * @param page
     * @param sort
     * @return
     */
    IPage<SaleInfoVo> findSaleInfoByPage(Page<SaleInfoVo> page,String sort);
}
