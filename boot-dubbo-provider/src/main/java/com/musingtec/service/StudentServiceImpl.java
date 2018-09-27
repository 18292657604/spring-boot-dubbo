package com.musingtec.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学生业务类的实现类
 * @author lsy
 * @date 2018/9/25
 */
@Service(version = "1.0")
@Component
public class StudentServiceImpl implements StudentService{

    @Override
    public List<Map<String, Object>> findStudentList(String id) {

        System.out.println("id--------->" + id);
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("id", 1);
        map.put("name", "Jack");

        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        mapList.add(map);

        return mapList;
    }

}
