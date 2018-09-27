package com.musingtec;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务提供段的启动类
 * @author lsy
 * @date 2018/9/25
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMain.class, args);
    }
}
