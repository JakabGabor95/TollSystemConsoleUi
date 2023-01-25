package hu.ltk.jakabgabor.models;

import hu.ltk.jakabgabor.enums.VehicleType;

public class VehicleModel {
    private String registrationNumber;
    private String make;
    private int numberOfSeats;
    private String vehicleType;

    public VehicleModel(String registrationNumber, String make, int numberOfSeats, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
