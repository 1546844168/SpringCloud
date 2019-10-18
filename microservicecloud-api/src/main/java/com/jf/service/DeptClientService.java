package com.jf.service;

import com.jf.entity.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 潇潇暮雨
 * @create 2018-12-05   10:25
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add")
    public boolean addDept(@RequestBody Department department);

    @GetMapping(value = "/dept/get/{id}")
    public Department getDeptById(@PathVariable("id") Integer id);

    @GetMapping(value = "/dept/get/list")
    public List<Department> getAllDept();


}