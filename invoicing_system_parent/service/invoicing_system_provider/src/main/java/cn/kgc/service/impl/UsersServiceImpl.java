package cn.kgc.service.impl;

import cn.kgc.dao.invoicingsystem.UsersMapper;
import cn.kgc.pojo.invoicingsystem.Users;
import cn.kgc.service.UsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
