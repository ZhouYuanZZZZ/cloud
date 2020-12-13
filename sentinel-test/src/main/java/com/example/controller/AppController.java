package com.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private static final Logger logger = LoggerFactory.getLogger(AppController.class);

    @SentinelResource(value = "returnOk",blockHandler = "returnOkHandler")
    @GetMapping("returnOk")
    public String returnOk(){
        logger.info("returnOk start");
        return "ok";
    }

    public String returnOkHandler(BlockException blockexception){
        logger.info("returnOkHandler");
        return "returnOkHandler ok";
    }
}
