package cn.kgc.service.impl;

import cn.kgc.dao.invoicingsystem.SaleMapper;
import cn.kgc.dao.invoicingsystem.vo.SaleInfoVoMapper;
import cn.kgc.pojo.invoicingsystem.Sale;
import cn.kgc.pojo.invoicingsystem.vo.SaleInfoVo;
import cn.kgc.service.SaleService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 吴雨森
 * @since 2020-05-10
 */
@Service
public class SaleServiceImpl extends ServiceImpl<SaleMapper, Sale> implements SaleService {

    @Autowired
    private SaleInfoVoMapper saleInfoVoMapper;

    @Override
    public IPage<SaleInfoVo> findSaleInfoByPage(Page<SaleInfoVo> page,String sort) {
        return this.saleInfoVoMapper.findSaleInfoPage(page,sort);
    }
}
