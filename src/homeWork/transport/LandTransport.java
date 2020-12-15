package homeWork.transport;

import java.util.Scanner;

public class LandTransport extends Transport {
    private int numberOfWheels;
    protected int fuelConsumption;

    public LandTransport(int horsepower, int maxSpeed, int mass, String brand, int numberOfWheels, int fuelConsumption) {
        super(horsepower, maxSpeed, mass, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Количество колес "+numberOfWheels);
        System.out.println("Расход топлива "+ fuelConsumption+"л/100 км");
    }


}
