package com.gerardcod.microservices.atm.atmgeolocation.controllers;

import com.gerardcod.microservices.atm.atmgeolocation.dto.ErrorResponse;
import com.gerardcod.microservices.atm.atmgeolocation.entities.Atm;
import com.gerardcod.microservices.atm.atmgeolocation.exceptions.GlobalHandleException;
import com.gerardcod.microservices.atm.atmgeolocation.services.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RestAtmController implements AtmController {
    @Autowired
    private AtmService service;

    @Override
    @GetMapping("/atms")
    public ResponseEntity<List<Atm>> findAll() throws GlobalHandleException {
        Optional<List<Atm>> result = service.findAll();

        if (result.isPresent() && result.get().size() > 0) {
            ResponseEntity.ok(result.get());
        }

        throw new GlobalHandleException("Empty collection", HttpStatus.NOT_FOUND, "Atm service", "There are no documents in the collection");
    }

    @ExceptionHandler(GlobalHandleException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> errorFallback(GlobalHandleException e) {
        return ResponseEntity.status(e.getCode()).body(ErrorResponse.fromException(e));
    }
}
