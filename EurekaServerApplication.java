package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * * *
 *
 * @FileName：PACKAGE_NAME
 * @Description：@TODO
 * @Author：qihongfei
 * @CreateTime：2018/04/09 15:55
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(EurekaServerApplication.class,args);

    }

}
