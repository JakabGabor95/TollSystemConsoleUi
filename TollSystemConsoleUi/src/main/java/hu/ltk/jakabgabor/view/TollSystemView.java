package hu.ltk.jakabgabor.view;

import hu.ltk.jakabgabor.entity.MotorwayVignette;
import hu.ltk.jakabgabor.controller.TollSystemController;
import hu.ltk.jakabgabor.models.MotorwayVignettesAndVehicleModel;
import hu.ltk.jakabgabor.models.VehicleModel;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class TollSystemView {
    private final Scanner scanner;
    private TollSystemController tollSystemController;

    public TollSystemView(TollSystemController tollSystemController) {
        this.tollSystemController = tollSystemController;
        scanner = new Scanner(System.in);
    }


    public void run(){
        Boolean isRunning = true;
        while (isRunning) {
            printMenu();
            String command = scanner.next();
            switch (command) {
                case "l":
                    System.out.println("Add meg az autó rendszámát:");
                    String registrationNumber = scanner.next();
                    tollSystemController.findByRegistrationNumber(registrationNumber);
                    break;
                case "k":
                    System.out.println("Sikeresen kiléptél");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Érvénytelen parancs!");
                    isRunning = false;
                    break;
            }
            System.out.println("--------------------------------------");
        }
    }
    public void display(MotorwayVignettesAndVehicleModel motorwayVignettesAndVehicleModel) {
        Date today = new Date();
        for (MotorwayVignette motorwayVignette : motorwayVignettesAndVehicleModel.getMotorwayVignetteList()) {
            String motorwayVignetteValues = "";
            motorwayVignetteValues += today.compareTo(motorwayVignette.getValidTo()) > 0 ? "X " : " ";
            motorwayVignetteValues += motorwayVignette.getValidFrom() + " ";
            motorwayVignetteValues += motorwayVignette.getValidTo() + " ";
            motorwayVignetteValues += motorwayVignette.getMotorwayVignetteType() + " ";
            motorwayVignetteValues += motorwayVignette.getDateOfPurchase() + " ";

            System.out.println(motorwayVignetteValues);
        }

        VehicleModel vehicle = motorwayVignettesAndVehicleModel.getVehicle();
            String vehicleDisplay = "";
            vehicleDisplay += "Jármű adatai: " + "\n";
            vehicleDisplay += "Rendszám: " + vehicle.getRegistrationNumber() + " \n";
            vehicleDisplay += "Jármű kategória: " + vehicle.getVehicleType() + "\n";
            vehicleDisplay += "Gyártmány: " + vehicle.getMake() + " \n";
            vehicleDisplay += "Szállítható személyek száma: " + vehicle.getNumberOfSeats() + "\n";

            System.out.println(vehicleDisplay);
    }

    private void printMenu() {
        System.out.println("Válassz tevékenységet!");
        System.out.println("Jármű lekérdezése rendszám alapján (l), Kilépés (k)");
    }
}
