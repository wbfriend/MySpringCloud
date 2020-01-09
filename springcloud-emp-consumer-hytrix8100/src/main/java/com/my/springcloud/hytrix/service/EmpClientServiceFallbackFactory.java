package com.my.springcloud.hytrix.service;


import com.my.springcloud.api.common.enums.EnumSet;
import com.my.springcloud.api.common.util.ResultUtil;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 必须添加@Component注解
 */
@Component
public class EmpClientServiceFallbackFactory implements FallbackFactory<EmpClientService> {

    @Override
    public EmpClientService create(Throwable cause) {
        return new EmpClientService() {
            @Override
            public ResultUtil getFindById(Integer id) {
                return new ResultUtil(EnumSet.HYSTRIX);
            }

            @Override
            public ResultUtil selectEmpList(Integer page, Integer pageSize) {
                return new ResultUtil(EnumSet.HYSTRIX);
            }
        };
    }
}
