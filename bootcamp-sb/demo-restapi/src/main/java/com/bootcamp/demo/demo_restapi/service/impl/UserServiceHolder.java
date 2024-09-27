package com.bootcamp.demo.demo_restapi.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_restapi.model.User;
import com.bootcamp.demo.demo_restapi.service.UserService;

@Service
public class UserServiceHolder implements UserService{
  // call API
  private static final String url = "https://jsonplaceholder.typicode.com/users";

  @Override
  public User[] getUsers() {
    return new RestTemplate().getForObject(url, User[].class); // right handside: return type of url
  }
}
