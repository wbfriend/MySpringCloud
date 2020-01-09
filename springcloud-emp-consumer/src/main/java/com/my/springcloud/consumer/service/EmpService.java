package com.my.springcloud.consumer.service;

import com.my.springcloud.api.common.util.ResultUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SPRINGCLOUD-EMP")
public interface EmpService {
    @GetMapping("/emp/get/{id}")
    ResultUtil getFindById(@PathVariable Integer id);
    @GetMapping("/emp/list/{page}/{pageSize}")
    ResultUtil selectEmpList(@PathVariable Integer page, @PathVariable Integer pageSize);

}
