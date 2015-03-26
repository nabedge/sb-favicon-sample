package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com.example")
@Controller
public class Application extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.setOrder(Integer.MAX_VALUE);
		registry.addResourceHandler("/favicon.ico").addResourceLocations("classpath:/static/musialnote.ico");
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/**/favicon.ico").addResourceLocations("classpath:/static/musicalnote.ico");
		// .setCachePeriod(3600);
	}
	

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Hello. Get <a href=\"/favicon.ico\">favicon.ico</a> . It should be 404 Not Found .";
	}

//	@RequestMapping("/favicon.ico")
//	@ResponseStatus(HttpStatus.NOT_FOUND)
//	public void favicon() {
//	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
