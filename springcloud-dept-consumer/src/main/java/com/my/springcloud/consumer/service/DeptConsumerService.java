package com.my.springcloud.consumer.service;

import com.my.springcloud.api.common.util.ResultUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "SPRINGCLOUD-DEPT")
public interface DeptConsumerService {

    @GetMapping("/dept/get/{id}")
    ResultUtil getFindById(@PathVariable Integer id);

    @GetMapping("/dept/list/{page}/{pageSize}")
    ResultUtil selectDeptConsumerList(@PathVariable Integer page, @PathVariable Integer pageSize);
}
