package com.github.hua777.dosb.controller;

import com.github.hua777.dosb.bean.Response;
import com.github.hua777.dosb.pojo.User;
import com.github.hua777.dosb.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @DubboReference(version = "1.0.0")
    UserService userService;

    @GetMapping("/users")
    public Response<List<User>> getUsers() {
        return new Response<>(userService.getUsers());
    }

    @GetMapping("/user/add")
    public Response<Void> getUsers(String name, Integer age) {
        userService.addUser(name, age);
        return new Response<>();
    }

}
