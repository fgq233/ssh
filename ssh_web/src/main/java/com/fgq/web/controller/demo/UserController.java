package com.fgq.web.controller.demo;

import com.fgq.domain.user.SysUser;
import com.fgq.service.organ.IOrganService;
import com.fgq.service.user.IUserService;
import com.fgq.util.data.AjaxReturn;
import com.fgq.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IOrganService organService;
    @Autowired
    private IUserService userService;


    @RequestMapping("/addUserPage")
    public String adduser(Model model){
        model.addAttribute("organList", organService.findAll());
        return "demo/addUserPage";
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public AjaxReturn adduser(SysUser sysUser){
        userService.addUser(sysUser);
        return new AjaxReturn(true);
    }



}
