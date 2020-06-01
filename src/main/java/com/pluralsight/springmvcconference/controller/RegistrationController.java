package com.pluralsight.springmvcconference.controller;

import com.pluralsight.springmvcconference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

@Controller
public class RegistrationController {

  @GetMapping("registration")
  public String getRegistration(@ModelAttribute("registration")Registration registration) {
      return "registration";
    }
}
