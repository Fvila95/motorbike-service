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
    private String chassis;
    private Integer potence;
    private Double torque;
    @Column(name = "wheel_size")
    private Integer wheelSize;
    private Integer gear;
    @Column(name = "usd_price")
    private Double usdPrice;

}
