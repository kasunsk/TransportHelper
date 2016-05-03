package com.kasun.app.transport.carpool.model;

import com.kasun.app.transport.application.common.model.AbstractEntity;

import javax.persistence.*;

/**
 * Created by kasunk on 5/3/16.
 */
@Entity
@Table(name = "CARPOOL")
public class CarpoolEntity extends AbstractEntity {

    @Id
    @Column(name = "CARPOOL_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CARPOOL")
    @SequenceGenerator(name = "SEQ_CARPOOL", sequenceName = "SEQ_CARPOOL")
    public Long carpoolId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(name = "OWNER")
    public Long owner;

    @Column(name = "CAR_TYPE")
    public String carType;

    @Column(name = "CAR_NUMBER")
    public String carNumber;

    @Column(name = "ORIGIN")
    public String origin;

    @Column(name = "DESTINATION")
    public String destination;

    @Column(name = "VIA")
    public String via;

    @Column(name = "NUMBER_OF_SEATS")
    public Integer numberOfSeats;

    @Column(name = "ALREADY_ALLOCATED")
    public Integer allocatedSeats;

    @Column(name = "AMOUNT_FOR_JOURNEY")
    public Double amountForJenny;

    public Long getCarpoolId() {
        return carpoolId;
    }

    public void setCarpoolId(Long carpoolId) {
        this.carpoolId = carpoolId;
    }

    public Double getAmountForJenny() {
        return amountForJenny;
    }

    public void setAmountForJenny(Double amountForJenny) {
        this.amountForJenny = amountForJenny;
    }

    public Integer getAllocatedSeats() {
        return allocatedSeats;
    }

    public void setAllocatedSeats(Integer allocatedSeats) {
        this.allocatedSeats = allocatedSeats;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }
}
