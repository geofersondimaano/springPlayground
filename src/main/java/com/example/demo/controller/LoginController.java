package com.example.demo.controller;

import com.example.demo.data.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/getUser")
    public String getUser() {
        return "Hello World";
    }

    @PostMapping("/createUser")
    public UserInfo createUser() {
        UserInfo userInfo = new UserInfo("Geof", "1234");
        return userInfo;
    }

    @PostMapping("/createUser1")
    public UserInfo createUser1(@RequestBody UserInfo userInfo) {
        UserInfoService userInfoService = new UserInfoService();
        userInfoService.createUser1(userInfo);
        return userInfo;
    }
}
