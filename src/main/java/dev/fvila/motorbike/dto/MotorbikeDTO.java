package dev.fvila.motorbike.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.fvila.motorbike.models.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotorbikeDTO {
    private String model;
    @JsonProperty(value = "release_year")
    private Integer releaseYear;
    private Brand brand;
    private String chasis;
    private int potencia;
    private double torque;
    private int rodado;
    private int marchas;
    private double precioarg;
}