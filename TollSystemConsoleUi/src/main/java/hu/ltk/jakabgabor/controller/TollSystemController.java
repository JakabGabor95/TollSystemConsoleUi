package hu.ltk.jakabgabor.controller;

import hu.ltk.jakabgabor.api.MotorwayVignetteRequestInterface;
import hu.ltk.jakabgabor.parser.RegistrationNumberParser;
import hu.ltk.jakabgabor.validator.MotorwayVignetteValidator;

public class TollSystemController {
    private  MotorwayVignetteRequestInterface motorwayVignetteRequestInterface;
    private RegistrationNumberParser registrationNumberParser = new RegistrationNumberParser();
    private MotorwayVignetteValidator motorwayVignetteValidator = new MotorwayVignetteValidator();

    public TollSystemController(MotorwayVignetteRequestInterface motorwayVignetteRequestInterface) {
        this.motorwayVignetteRequestInterface = motorwayVignetteRequestInterface;
    }

    public void findByRegistrationNumber(String registrationNumber) {
        motorwayVignetteValidator.checkRegistrationNumberIsNull(registrationNumber);
        String registrationNumberJson = registrationNumberParser
                .parseRegistrationNumberToJson(registrationNumber);
        motorwayVignetteRequestInterface
                .findVehicleWithVignettesByRegistrationNumber(registrationNumberJson);
    }
}
