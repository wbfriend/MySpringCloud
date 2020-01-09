package com.my.springcloud.api.entity.dept;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Dept {
    private Integer id;
    private String deptName;
    private String deptNo;
    private String source;
    private Date createTime;
    private Date moditiyTime;
}
