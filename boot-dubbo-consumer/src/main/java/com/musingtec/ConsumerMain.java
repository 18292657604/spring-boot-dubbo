package com.musingtec;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by angel on 2018/9/25.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class, args);
    }
}
