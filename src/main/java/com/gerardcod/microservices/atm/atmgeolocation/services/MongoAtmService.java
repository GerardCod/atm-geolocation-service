package com.gerardcod.microservices.atm.atmgeolocation.services;

import com.gerardcod.microservices.atm.atmgeolocation.entities.Atm;
import com.gerardcod.microservices.atm.atmgeolocation.repositories.AtmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoAtmService implements AtmService {
    @Autowired
    private AtmRepository repository;


    @Override
    public Optional<List<Atm>> findAll() {
        List<Atm> result = repository.findAll();
        return Optional.of(result);
    }
}
