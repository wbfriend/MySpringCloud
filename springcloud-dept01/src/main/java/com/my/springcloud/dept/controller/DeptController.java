package com.my.springcloud.dept.controller;

import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/get/{id}")
    public ResultUtil getFindById(@PathVariable Integer id){
        System.out.println("=====get======第一个生产者====dept===========");
        return deptService.getFindById(id);
    }

    @GetMapping("/list/{page}/{pageSize}")
    public ResultUtil selectDeptList(@PathVariable Integer page, @PathVariable Integer pageSize){
        System.out.println("=====list======第一个生产者=====dept==========");
        return deptService.selectDeptList(page, pageSize);
    }

}
