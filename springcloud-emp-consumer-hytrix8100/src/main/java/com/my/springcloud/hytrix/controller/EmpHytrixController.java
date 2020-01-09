package com.my.springcloud.hytrix.controller;

import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.hytrix.service.EmpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hystrix")
public class EmpHytrixController {

    @Autowired
    private EmpClientService empClientService;

    @GetMapping("/hello")
    public ResultUtil get(){
        return new ResultUtil("hello word !");
    }

    @GetMapping("/get/{id}")
    public ResultUtil get(@PathVariable Integer id){
        return empClientService.getFindById(id);
    }
    @GetMapping("/list/{page}/{pageSize}")
    public ResultUtil list(@PathVariable Integer page, @PathVariable Integer pageSize){
        return empClientService.selectEmpList(page,pageSize);
    }

}
