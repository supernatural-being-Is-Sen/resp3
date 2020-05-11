package cn.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class InvocingSystemConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(InvocingSystemConsumerApplication.class,args);
    }
}
