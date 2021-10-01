package com.gerardcod.microservices.atm.atmgeolocation.dto;

import com.gerardcod.microservices.atm.atmgeolocation.exceptions.GlobalHandleException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String type;
    private HttpStatus code;
    private String location;
    private String moreInfo;

    public static ErrorResponse fromException(GlobalHandleException e) {
        return new ErrorResponse(e.getType(), e.getCode(), e.getLocation(), e.getMoreInfo());
    }
}
