package com.my.springcloud.dept.service;


import com.my.springcloud.api.common.util.ResultUtil;

public interface DeptService {

    ResultUtil getFindById(Integer id);

    ResultUtil selectDeptList(Integer page, Integer pageSize);
}
