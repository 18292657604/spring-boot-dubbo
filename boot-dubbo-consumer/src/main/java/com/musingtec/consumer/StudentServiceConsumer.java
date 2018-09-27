package com.musingtec.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.musingtec.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 消费端
 * @author angel
 * @date 2018/9/25
 */
@Component
public class StudentServiceConsumer {

    @Reference(version = "1.0")
    private StudentService studentService;


    public List<Map<String, Object>> consumerStudent(){
        List<Map<String, Object>> mapList = studentService.findStudentList("12");

        System.out.println("消费的结果是：" + mapList);
        return mapList;
    }

}
