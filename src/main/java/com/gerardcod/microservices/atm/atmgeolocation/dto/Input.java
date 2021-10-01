package com.gerardcod.microservices.atm.atmgeolocation.dto;

import lombok.*;
import org.jetbrains.annotations.NotNull;

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
