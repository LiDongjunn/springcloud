package com.falltwo.springcloud.service;


import com.falltwo.springcloud.pojo.Dept;

import java.util.List;


public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();
}
