package cn.kgc.controller;

import cn.kgc.client.invoicingsystem.RestUsersClient;
import cn.kgc.commonbase.exceptionhandler.InvoicingSystemException;
import cn.kgc.pojo.invoicingsystem.Users;
import cn.kgc.utils.BCrypt;
import cn.kgc.utils.Result;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;


/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private RestUsersClient restUsersClient;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("login")
    public Result login(@RequestBody Users user){
        Users loginUser = this.restUsersClient.login(user);
        if(loginUser == null) {
            throw new InvoicingSystemException("没有找到此用户");
        }
        if(!BCrypt.checkpw(user.getPassword(),loginUser.getPassword())) {
            throw new InvoicingSystemException("密码输入错误");
        }
        //生成随机 token 字符串
        String uuid = UUID.randomUUID().toString().replace("-", "");
        this.redisTemplate.boundValueOps(uuid).set(JSON.toJSONString(loginUser),2, TimeUnit.HOURS);
        return Result.success("登录成功",uuid);
    }

    /**
     * 获取用户信息
     * @param token
     * @return
     */
    @GetMapping("getUserInfo/{token}")
    public Result getUserInfo(@PathVariable String token){
        String userInfo = this.redisTemplate.boundValueOps(token).get();
        return Result.success(userInfo);
    }
}
