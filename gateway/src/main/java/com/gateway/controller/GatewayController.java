package com.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GatewayController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello gateway!";
    }


}
