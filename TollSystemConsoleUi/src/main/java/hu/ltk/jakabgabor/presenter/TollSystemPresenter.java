package hu.ltk.jakabgabor.presenter;

import com.google.gson.*;
import hu.ltk.jakabgabor.api.MotorwayVignetteResponseInterface;
import hu.ltk.jakabgabor.models.MotorwayVignettesAndVehicleModel;
import hu.ltk.jakabgabor.validator.MotorwayVignetteValidator;
import hu.ltk.jakabgabor.view.TollSystemView;

import java.lang.reflect.Type;
import java.time.LocalDate;



public class TollSystemPresenter implements MotorwayVignetteResponseInterface {
    TollSystemView tollSystemView;
    Gson gson = new Gson();
    MotorwayVignetteValidator motorwayVignetteValidator = new MotorwayVignetteValidator();
    public void setTollSystemView(TollSystemView toolSystemView) {
        this.tollSystemView = toolSystemView;
    }

    @Override
    public void display(String motorwayVignetteJson) {
       motorwayVignetteValidator.validateByMotorwayVignette(motorwayVignetteJson);
        MotorwayVignettesAndVehicleModel motorwayVignettesAndVehicleModel =
                gson.fromJson(motorwayVignetteJson, MotorwayVignettesAndVehicleModel.class);

        tollSystemView.display(motorwayVignettesAndVehicleModel);
    }
}
