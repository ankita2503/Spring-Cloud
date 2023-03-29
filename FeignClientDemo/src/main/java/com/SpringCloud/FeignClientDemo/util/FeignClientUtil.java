package com.SpringCloud.FeignClientDemo.util;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo",url="http://localhost:8084/users")
public interface FeignClientUtil {
    @GetMapping("/name")
    public String getname();
}
