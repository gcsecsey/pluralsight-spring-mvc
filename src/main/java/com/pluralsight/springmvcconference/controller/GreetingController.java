package com.pluralsight.springmvcconference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

  @GetMapping("greeting")
  public String greeting(Map<String, Object> model) {
    model.put("message", "Hello World"); // JSP var name
    return "greeting"; // pass it back to JSP
  }

  @GetMapping("thyme")
  public String thyme(Map<String, Object> model) {
    model.put("message", "Hello Thymeleaf"); // JSP var name
    return "thyme"; // pass it back to JSP
  }
}
