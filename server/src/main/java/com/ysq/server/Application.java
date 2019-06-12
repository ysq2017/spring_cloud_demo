package com.ysq.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yangshaoqiang
 * @date 2019/6/12
 * @desc server启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(true).run(args);

//        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.addListeners(new ApplicationPidFileWriter());
//        springApplication.run(args);
    }
}
