package com.falltwo.springcloud.service;


import com.falltwo.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@ComponentScan
// fallbackFactory 通过这个去指定服务降级
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping("/dept/list")
    List<Dept> getQueryAll();
    /*按照id查询信息*/
    @GetMapping("/dept/get/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id);
}
