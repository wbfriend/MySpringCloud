package com.my.springcloud.emp.service.impl;

import com.my.springcloud.api.common.util.PageUtils;
import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.emp.mapper.EmpMapper;
import com.my.springcloud.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public ResultUtil getFindById(Integer id){
        return new ResultUtil(empMapper.getFindById(id));
    }
    @Override
    public ResultUtil selectEmpList(Integer page,Integer pageSize){
       PageUtils p = new PageUtils(page,pageSize);
        return new ResultUtil(empMapper.selectEmpList(p.getPage(),p.getPageSize()),empMapper.selectEmpCount());
    }
}
