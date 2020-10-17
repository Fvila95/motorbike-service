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
}
