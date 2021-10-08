package com.gerardcod.microservices.atm.atmgeolocation.dto;

import javax.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Input {
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
}
