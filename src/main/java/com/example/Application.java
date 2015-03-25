package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@EnableAutoConfiguration
@Configuration
@ComponentScan("com.example")
@Controller
public class Application {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hello. get <a href=\"/favicon.ico\">favicon.ico</a>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}