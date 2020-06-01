package com.pluralsight.springmvcconference.controller;

import com.pluralsight.springmvcconference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/user")
  public User getUser(
      @RequestParam(value = "firstName", defaultValue = "Bob") String firstName,
      @RequestParam(value = "lastName", defaultValue = "Bobbertson") String lastName,
      @RequestParam(value = "age", defaultValue = "35") int age
  ) {
    User user = new User();
    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setAge(age);
    return user;
  }
}
