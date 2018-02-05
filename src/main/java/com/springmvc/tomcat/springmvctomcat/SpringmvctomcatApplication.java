package com.springmvc.tomcat.springmvctomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringmvctomcatApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringmvctomcatApplication.class);
    }



    public static void main(String[] args) {
		SpringApplication.run(SpringmvctomcatApplication.class, args);
	}
}



