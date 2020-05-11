package cn.kgc.client.invoicingsystem;

import cn.kgc.pojo.invoicingsystem.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@FeignClient(name = "invoicing-system-provider")
public interface RestUsersClient {

    /**
     * 登录
     * @param loginUser
     * @return
     */
    @PostMapping("/users/login")
    Users login(@RequestBody Users loginUser);
}
