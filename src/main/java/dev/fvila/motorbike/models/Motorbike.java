package dev.fvila.motorbike.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Motorbike {
    @Id
    private Integer id;
    private String model;
    @Column(name = "release_year")
    private Integer releaseYear;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private String chasis;
    private int potencia;
    private double torque;
    private int rodado;
    private int marchas;
    private double preciousd = 183;

    

}
