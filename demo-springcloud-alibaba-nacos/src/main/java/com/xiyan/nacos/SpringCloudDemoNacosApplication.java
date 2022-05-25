package com.xiyan.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author peng.wang
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringCloudDemoNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoNacosApplication.class, args);
    }

}

