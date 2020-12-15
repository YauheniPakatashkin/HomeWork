package homeWork.transport;

import java.util.Scanner;

public class LightTransport  extends LandTransport {
    private String bodyType;
    private int numberOfPassengers;

    public LightTransport(int horsepower, int maxSpeed, int mass, String brand, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(horsepower, maxSpeed, mass, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Тип кузова " + bodyType);
        System.out.println("Количество пассажиров " + numberOfPassengers);
    }


        public void distance (int hours){
            double distance = hours * super.maxSpeed;
            double volume = distance/fuelConsumption;
            System.out.println("За время "+ hours+ " ч, автомобиль "+brand+" двигаясь с максимальной скоростью " +
                    maxSpeed+" км/ч проедет "+distance+ " км и израсходует "+ volume+" литров топлива.");
        }


}