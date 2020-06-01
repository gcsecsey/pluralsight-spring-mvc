package com.pluralsight.springmvcconference;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class ConferenceConfig {

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver bean = new InternalResourceViewResolver();
    bean.setPrefix("/WEB-INF/jsp/");
    bean.setSuffix(".jsp");
    bean.setOrder(0);
    return bean;
  }
}
