package com.my.springcloud.consumer.controller;

import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.consumer.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class EmpController {
    @Autowired
    public EmpService empService;
    @GetMapping("/get/{id}")
    public ResultUtil getFindById(@PathVariable Integer id){
        return empService.getFindById(id);
    }
    @GetMapping("/list/{page}/{pageSize}")
    public ResultUtil selectEmpList(@PathVariable Integer page,@PathVariable Integer pageSize){
        return empService.selectEmpList(page,pageSize);
    }
}
