package cn.kgc;

import cn.kgc.utils.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"cn.kgc.dao.invoicingsystem","cn.kgc.dao.invoicingsystem.vo"})
public class InvoicingSystemProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(InvoicingSystemProviderApplication.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
