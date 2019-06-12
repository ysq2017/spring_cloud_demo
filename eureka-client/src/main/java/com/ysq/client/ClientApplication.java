package com.ysq.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangshaoqiang
 * @date 2019/6/12
 * @desc client启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(ClientApplication.class)
//                .web(true).run(args);

        SpringApplication springApplication = new SpringApplication(ClientApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }
}
