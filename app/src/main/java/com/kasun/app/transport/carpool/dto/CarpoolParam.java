package com.kasun.app.transport.carpool.dto;

/**
 * Created by kasunk on 5/3/16.
 */
public class CarpoolParam {

    public String carpoolId;
    public String owner;
    public String carType;
    public String carNumber;
    public String origin;
    public String destination;
    public String via;
    public String numberOfSeats;
    public String allocatedSeats;
    public String amountForJenny;

    public String getCarpoolId() {
        return carpoolId;
    }

    public void setCarpoolId(String carpoolId) {
        this.carpoolId = carpoolId;
    }

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

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getAllocatedSeats() {
        return allocatedSeats;
    }

    public void setAllocatedSeats(String allocatedSeats) {
        this.allocatedSeats = allocatedSeats;
    }

    public String getAmountForJenny() {
        return amountForJenny;
    }

    public void setAmountForJenny(String amountForJenny) {
        this.amountForJenny = amountForJenny;
    }
}
