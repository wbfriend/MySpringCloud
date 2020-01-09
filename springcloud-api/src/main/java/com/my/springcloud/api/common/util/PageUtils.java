package com.my.springcloud.api.common.util;

import lombok.Data;

@Data
public class PageUtils {
    private Integer page = 0;
    private  Integer pageSize = 10;

   public PageUtils(Integer page, Integer pageSize){
       if (page != null && page > 0) {
           page = page - 1;
       } else {
           page = 0;
       }
       if (pageSize == null || pageSize == 0) {
           pageSize = 10;
       }
       this.page = page * pageSize;
       this.pageSize = pageSize;
    }
}
