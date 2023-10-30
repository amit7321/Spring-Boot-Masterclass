package com.example.springbootmasterclass.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner() {
        return args -> {

        };
    }
}
