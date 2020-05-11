package cn.kgc.dao.invoicingsystem.vo;

import cn.kgc.pojo.invoicingsystem.vo.SaleInfoVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
public interface SaleInfoVoMapper extends BaseMapper<SaleInfoVo> {

    /**
     * 条件分页查询销售信息
     * @param page
     * @param sort
     * @return
     */
    IPage<SaleInfoVo> findSaleInfoPage(Page<SaleInfoVo> page,@Param("sort") String sort);
}
