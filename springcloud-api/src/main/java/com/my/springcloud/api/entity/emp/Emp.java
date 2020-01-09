package com.my.springcloud.api.entity.emp;

import lombok.Data;

import java.util.Date;
@Data
public class Emp {
    private Integer id;
    private String empName;
    private String empPhone;
    private String empJob;
    private String empNo;
    private Date createTime;
    private Date moditiyTime;

}
