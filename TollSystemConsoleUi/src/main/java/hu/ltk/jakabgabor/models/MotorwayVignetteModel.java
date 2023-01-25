package hu.ltk.jakabgabor.models;


public class MotorwayVignetteModel {
    String registrationNumber;
    String vehicleCategory;
    String motorwayVignetteType;
    float price;
    String validFrom;
    String validTo;
    String dateOfPurchase;

    public MotorwayVignetteModel(String registrationNumber, String vehicleCategory, String motorwayVignetteType, float price, String validFrom, String validTo, String dateOfPurchase) {
        this.registrationNumber = registrationNumber;
        this.vehicleCategory = vehicleCategory;
        this.motorwayVignetteType = motorwayVignetteType;
        this.price = price;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getMotorwayVignetteType() {
        return motorwayVignetteType;
    }

    public void setMotorwayVignetteType(String motorwayVignetteType) {
        this.motorwayVignetteType = motorwayVignetteType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
