package com.my.springcloud.emp.mapper;

import com.my.springcloud.api.entity.emp.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
     Emp getFindById(Integer id);
     List<Emp> selectEmpList(Integer page, Integer pageSize);
     Integer selectEmpCount();
}
