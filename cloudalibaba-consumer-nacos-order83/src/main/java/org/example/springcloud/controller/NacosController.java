package org.example.springcloud.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NacosPropertySource(dataId = "example",autoRefreshed = true)
public class NacosController {

    @NacosValue(value = "${info:Local Hello world}",autoRefreshed = true)
    private String info;

    @GetMapping("/config")
    public String get(){
        return info;
    }
}
