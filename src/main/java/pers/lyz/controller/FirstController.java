package pers.lyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author asd00000mm
 * 启动项目后跳转到登录页面
 */
@Controller
public class FirstController {
    @RequestMapping("/")
    public String login(){
        return "forward:login.html";
    }
}
