package com.my.springcloud.dept.mapper;

import com.my.springcloud.api.entity.dept.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DeptMapper {
    Dept getFindById(Integer id);
    List<Dept> selectDeptList(Integer page, Integer pageSize);
    Integer selectDeptCount();
}
