package com.gerardcod.microservices.atm.atmgeolocation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "atms")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Atm {
    @Id
    @JsonIgnore
    private String id;
    private String atmId;
    private String city;
    private String street;
    private String address;
    private String state;
    private String latitude;
    private String longitude;
    private String type;
}
