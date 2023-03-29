package com.SpringCloud.FeignClientDemo.Controller;

import com.SpringCloud.FeignClientDemo.util.FeignClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignClientDemoController {

    @Autowired
    FeignClientUtil feignClientUtil;

    @GetMapping("/username")
    public String getname(){
        return feignClientUtil.getname();
    }


}
