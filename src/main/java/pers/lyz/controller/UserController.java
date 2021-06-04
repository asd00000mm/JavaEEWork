package pers.lyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.lyz.model.Msg;
import pers.lyz.model.User;
import pers.lyz.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Msg login(@RequestBody User user){
        User login = userService.login(user);
        if (login!=null){
            return Msg.success();
        }else{
            return Msg.fail();
        }

    }

}
