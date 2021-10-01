package com.gerardcod.microservices.atm.atmgeolocation.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GlobalHandleException extends Exception {
    private String type;
    private HttpStatus code;
    private String location;
    private String moreInfo;
}
