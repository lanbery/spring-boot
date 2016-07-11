package com.lollipop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The type Application.
 */
@SpringBootApplication
@EnableWebMvc
@RequestMapping("/")
public class Application extends WebMvcConfigurerAdapter {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Home string.
     *
     * @return the string
     */
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}