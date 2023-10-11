package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainJpaApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MainJpaApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(MainJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}