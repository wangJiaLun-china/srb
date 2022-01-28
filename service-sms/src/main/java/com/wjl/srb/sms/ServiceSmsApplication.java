package com.wjl.srb.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.wjl.srb", "com.wjl.common"})
public class ServiceSmsApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ServiceSmsApplication.class, args);
    }
}