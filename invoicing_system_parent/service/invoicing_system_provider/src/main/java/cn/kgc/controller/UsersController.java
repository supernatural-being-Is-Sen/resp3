package cn.kgc.controller;

import cn.kgc.pojo.invoicingsystem.Users;
import cn.kgc.service.UsersService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 吴雨森
 * @since 2020-05-10
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 登录
     * @param loginUser
     * @return
     */
    @PostMapping("login")
    public Users login(@RequestBody Users loginUser){
        return this.usersService.getOne(new QueryWrapper<Users>()
                .lambda().eq(Users::getUserName, loginUser.getUserName()));
    }
}

