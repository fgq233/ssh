package com.fgq.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    protected static final String REDIRECT = "redirect:";
    protected static final String FORWARD = "forward:";

    /**
     *  @ModelAttribute 在方法上，会在每一个 @RequestMapping 标注的方法前执行
     */
//    @ModelAttribute
//    public void initPath(HttpServletRequest request, Model model){
//        String organ = request.getContextPath();
//        model.addAttribute("organ", organ);
//
//    }
}
