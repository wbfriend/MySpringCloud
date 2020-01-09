package com.my.springcloud.hytrix.service;

import com.my.springcloud.api.common.util.ResultUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="SPRINGCLOUD-EMP",fallbackFactory = EmpClientServiceFallbackFactory.class)
public interface EmpClientService {
    @GetMapping("/emp/get/{id}")
    ResultUtil getFindById(@PathVariable Integer id);

    @GetMapping("/emp/list/{page}/{pageSize}")
    ResultUtil selectEmpList(@PathVariable Integer page, @PathVariable Integer pageSize);
}
