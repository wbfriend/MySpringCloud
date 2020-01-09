package com.my.springcloud.dept.service.impl;

import com.my.springcloud.api.common.util.PageUtils;
import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.api.entity.dept.Dept;
import com.my.springcloud.dept.mapper.DeptMapper;
import com.my.springcloud.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public ResultUtil getFindById(Integer id) {
        return new ResultUtil(deptMapper.getFindById(id));
    }

    @Override
    public ResultUtil selectDeptList(Integer page, Integer pageSize) {
        PageUtils pageUtil = new PageUtils(page, pageSize);
        List<Dept> deptList = deptMapper.selectDeptList(pageUtil.getPage(),pageUtil.getPageSize());
        Integer total = deptMapper.selectDeptCount();
        return new ResultUtil(deptList,total);
    }
}
