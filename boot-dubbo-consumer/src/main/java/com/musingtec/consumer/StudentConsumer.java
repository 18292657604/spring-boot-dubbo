package com.musingtec.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 * @author angel
 * @date 2018/9/25
 */
@RestController("/")
public class StudentConsumer {

    @Autowired
    private StudentServiceConsumer studentServiceConsumer;


    @GetMapping("/getList")
    public List<Map<String, Object>> getList(){
        return studentServiceConsumer.consumerStudent();
    }

}
