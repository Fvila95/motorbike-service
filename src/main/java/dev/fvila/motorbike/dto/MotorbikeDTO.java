package dev.fvila.motorbike.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.fvila.motorbike.models.Brand;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MotorbikeDTO {
    private String model;
    @JsonProperty(value = "release_year")
    private Integer releaseYear;
    private Brand brand;
    private String chassis;
    private Integer potence;
    private double torque;
    private Integer WheelSize;
    private Integer gear;
    private double precioarg;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Integer getPotence() {
        return potence;
    }

    public void setPotence(Integer potence) {
        this.potence = potence;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public Integer getWheelSize() {
        return WheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        WheelSize = wheelSize;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public double getPrecioarg() {
        return precioarg;
    }

    public void setPrecioarg(double precioarg) {
        this.precioarg = precioarg;
    }
}