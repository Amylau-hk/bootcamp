package com.bootcamp.demo.demo_restapi.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_restapi.controller.UserOperation;
import com.bootcamp.demo.demo_restapi.model.User;
import com.bootcamp.demo.demo_restapi.service.UserService;

@RestController // @Controller + @ResponseBody
public class UserController implements UserOperation {
  @Autowired
  private UserService userService;

  @Override
  public User[] getUsers() {
    return userService.getUsers();
  }
}
