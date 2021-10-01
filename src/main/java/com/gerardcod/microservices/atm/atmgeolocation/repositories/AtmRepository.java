package com.gerardcod.microservices.atm.atmgeolocation.repositories;

import com.gerardcod.microservices.atm.atmgeolocation.entities.Atm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmRepository extends MongoRepository<Atm, String> {
}
