package com.musingtec.service;

import java.util.List;
import java.util.Map;

/**
 * Created by angel on 2018/9/20.
 */
public interface StudentService {

    public List<Map<String, Object>> findStudentList(String id);
}
