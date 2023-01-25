package hu.ltk.jakabgabor.models;

import hu.ltk.jakabgabor.entity.MotorwayVignette;

import java.util.List;

public class MotorwayVignettesAndVehicleModel {
    private VehicleModel vehicle;
    private List<MotorwayVignette> motorwayVignetteList;

    public MotorwayVignettesAndVehicleModel(VehicleModel vehicle, List<MotorwayVignette> motorwayVignetteList) {
        this.vehicle = vehicle;
        this.motorwayVignetteList = motorwayVignetteList;
    }

    public VehicleModel getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleModel vehicle) {
        this.vehicle = vehicle;
    }

    public List<MotorwayVignette> getMotorwayVignetteList() {
        return motorwayVignetteList;
    }

    public void setMotorwayVignetteList(List<MotorwayVignette> motorwayVignetteList) {
        this.motorwayVignetteList = motorwayVignetteList;
    }
}
