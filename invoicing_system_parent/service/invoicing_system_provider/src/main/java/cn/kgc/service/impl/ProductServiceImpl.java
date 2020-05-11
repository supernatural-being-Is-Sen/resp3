package cn.kgc.service.impl;

import cn.kgc.dao.invoicingsystem.ProductMapper;
import cn.kgc.pojo.invoicingsystem.Product;
import cn.kgc.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
