package com.gerardcod.microservices.atm.atmgeolocation;

import com.gerardcod.microservices.atm.atmgeolocation.repositories.AtmRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = AtmRepository.class)
public class AtmGeolocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmGeolocationApplication.class, args);
    }

}
