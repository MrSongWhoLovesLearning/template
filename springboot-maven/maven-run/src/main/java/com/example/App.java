package com.example;

import com.example.utils.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(DateUtils.format(new Date()));
    }
}
