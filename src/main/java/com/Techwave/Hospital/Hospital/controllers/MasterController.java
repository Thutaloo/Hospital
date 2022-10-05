package com.Techwave.Hospital.Hospital.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MasterController implements WebMvcConfigurer {
    public void viewControllers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
    }
}
