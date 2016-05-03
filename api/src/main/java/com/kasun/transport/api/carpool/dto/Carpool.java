package com.kasun.transport.api.carpool.dto;

/**
 * Created by kasunk on 5/3/16.
 */
public class Carpool {

    public String owner;
    public String carType;
    public String carNumber;
    public String origin;
    public String destination;
    public String via;
    public Integer numberOfSeats;
    public Integer allocatedSeats;
    public Double amountForJenny;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getAllocatedSeats() {
        return allocatedSeats;
    }

    public void setAllocatedSeats(Integer allocatedSeats) {
        this.allocatedSeats = allocatedSeats;
    }

    public Double getAmountForJenny() {
        return amountForJenny;
    }

    public void setAmountForJenny(Double amountForJenny) {
        this.amountForJenny = amountForJenny;
    }
}
