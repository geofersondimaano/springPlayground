package com.example.demo.service;

import com.example.demo.data.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserInfoService {

    public UserInfo createUser1(@RequestBody UserInfo userInfo) {
        String[] users = {"Geof", "Ezra", "Jun"};
        for (String user : users) {
            if(userInfo.getUserName().equals(user)) {
                System.out.println(userInfo.getUserName());
                userInfo.setErrortxt("This is already Created");
                userInfo.setUserName(null);
                userInfo.setPassword(null);
            }
        }
        return userInfo;
    }

}
