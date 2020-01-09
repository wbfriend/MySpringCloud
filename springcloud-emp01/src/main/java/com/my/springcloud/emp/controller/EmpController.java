package com.my.springcloud.emp.controller;

import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/get/{id}")
    public ResultUtil getFindById(@PathVariable Integer id){
        return empService.getFindById(id);
    }
    @GetMapping("/list/{page}/{pageSize}")
    public ResultUtil selectEmpList(@PathVariable Integer page,@PathVariable Integer pageSize){
        return empService.selectEmpList(page,pageSize);
    }
}
