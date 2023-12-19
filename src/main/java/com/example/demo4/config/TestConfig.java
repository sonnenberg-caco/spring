package com.example.demo4.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo4.entities.User;
import com.example.demo4.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "33333333", "12345");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "33355555", "334455");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
