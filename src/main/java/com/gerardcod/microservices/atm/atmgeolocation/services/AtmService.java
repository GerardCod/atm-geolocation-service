package com.gerardcod.microservices.atm.atmgeolocation.services;

import com.gerardcod.microservices.atm.atmgeolocation.entities.Atm;

import java.util.List;
import java.util.Optional;

public interface AtmService {
    Optional<List<Atm>> findAll();
}
