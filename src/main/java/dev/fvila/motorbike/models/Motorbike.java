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
    private double usdPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Double getTorque() {
        return torque;
    }

    public void setTorque(Double torque) {
        this.torque = torque;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }
}
