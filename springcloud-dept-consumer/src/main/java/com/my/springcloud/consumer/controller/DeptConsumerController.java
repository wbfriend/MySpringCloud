package com.my.springcloud.consumer.controller;

import com.my.springcloud.api.common.util.ResultUtil;
//import com.my.springcloud.api.hytrix.service.dept.DeptClientService;
import com.my.springcloud.consumer.service.DeptConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    //负载均衡Ribbon
//    private final String Ribbon_RUL="http://SPRINGCLOUD-DEPT";
//    @Autowired
//    private RestTemplate restTemplate;
//    @GetMapping("/get/{id}")
//    public ResultUtil getFindById(@PathVariable Integer id) {
//        System.out.println("======get=====第二个消费者=======consumer========");
//        return restTemplate.getForObject("http://" + Ribbon_RUL + "/dept/get/" + id,ResultUtil.class);
//    }
//    @GetMapping("/list/{page}/{pageSize}")
//    public ResultUtil selectDeptConsumerList(@PathVariable Integer page,@PathVariable Integer pageSize) {
//        System.out.println("======get=====第二个消费者=======consumer========");
//        return restTemplate.getForObject("http://" + Ribbon_RUL + "/dept/get/" + page+"/"+pageSize,ResultUtil.class);
//    }
//    @Autowired
//    private DeptClientService deptConsumerService;
     //负载均衡Feign

    @Autowired
    private DeptConsumerService deptConsumerService;

    @GetMapping("/get/{id}")
    public ResultUtil getFindById(@PathVariable Integer id){
        System.out.println("======get=====第二个消费者=======consumer========");
        return deptConsumerService.getFindById(id);
    }
    @GetMapping("/list/{page}/{pageSize}")
    public ResultUtil selectDeptConsumerList(@PathVariable Integer page,@PathVariable Integer pageSize){
        System.out.println("======get=====第二个消费者=======consumer========");
        return deptConsumerService.selectDeptConsumerList(page,pageSize);
    }

}
