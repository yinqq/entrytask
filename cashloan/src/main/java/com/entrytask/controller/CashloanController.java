package com.entrytask.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CashloanController {
    @RequestMapping("/")
    @ResponseBody
    void home() {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,String> msg = new HashMap<>();
        msg.put("Result","ok");
        msg.put("Service","cashloan hello");
//        return obj2StringPretty(msg);
    }




}
