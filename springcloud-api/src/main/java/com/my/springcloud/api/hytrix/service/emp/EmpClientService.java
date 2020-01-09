package com.my.springcloud.api.hytrix.service.emp;

import com.my.springcloud.api.common.util.ResultUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(value="SPRINGCLOUD-EMP-CONSUMER-HYTRIX",fallbackFactory = EmpClientServiceFallbackFactory.class)
@FeignClient(value="SPRINGCLOUD-EMP",fallbackFactory = EmpClientServiceFallbackFactory.class)
//@FeignClient(value="SPRINGCLOUD-EMP")
public interface EmpClientService {
    @GetMapping("/emp/get/{id}")
    ResultUtil getFindById(@PathVariable Integer id);

    @GetMapping("/emp/list/{page}/{pageSize}")
    ResultUtil selectEmpList(@PathVariable Integer page, @PathVariable Integer pageSize);
}
