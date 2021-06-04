package pers.lyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author asd00000mm
 */
@Controller
public class FirstController {
    @RequestMapping("/")
    public String hello(){
        return "forward:login.html";
    }
}
