package hu.ltk.jakabgabor.validator;

import com.google.gson.Gson;
import hu.ltk.jakabgabor.exception.InvalidMotorwayVignetteException;
import hu.ltk.jakabgabor.exception.InvalidRegistrationNumberException;

public class MotorwayVignetteValidator {
    Gson gson = new Gson();
    public void validateByMotorwayVignette(String motorwayVignetteJson) {
        try {
            gson.fromJson(motorwayVignetteJson, Object.class);
        } catch (Exception e) {
            throw new InvalidMotorwayVignetteException();
        }
    }

    public void checkRegistrationNumberIsNull(String registrationNumber) {
        try {
            if (registrationNumber.equals(null)) {
                throw new InvalidRegistrationNumberException();
            }
        }catch (InvalidRegistrationNumberException e){

        }
    }
}
