package com.gerardcod.microservices.atm.atmgeolocation.controllers;

import com.gerardcod.microservices.atm.atmgeolocation.entities.Atm;
import com.gerardcod.microservices.atm.atmgeolocation.exceptions.GlobalHandleException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AtmController {
    ResponseEntity<List<Atm>> findAll() throws GlobalHandleException;
}
