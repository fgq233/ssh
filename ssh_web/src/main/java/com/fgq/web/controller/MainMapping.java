package com.fgq.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMapping {

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
