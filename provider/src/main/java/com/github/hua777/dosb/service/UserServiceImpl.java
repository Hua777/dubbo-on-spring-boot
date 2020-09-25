package com.github.hua777.dosb.service;

import com.github.hua777.dosb.pojo.User;
import com.github.hua777.dosb.repository.UserRepository;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userRepository.save(user);
    }
}
