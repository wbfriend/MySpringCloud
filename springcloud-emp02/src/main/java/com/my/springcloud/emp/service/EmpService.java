package com.my.springcloud.emp.service;


import com.my.springcloud.api.common.util.ResultUtil;

public interface EmpService {

    ResultUtil getFindById(Integer id);
    ResultUtil selectEmpList(Integer page,Integer pageSize);

}
