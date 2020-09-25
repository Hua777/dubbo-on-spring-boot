package com.github.hua777.dosb.service;

import com.github.hua777.dosb.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void addUser(String name, Integer age);

}
