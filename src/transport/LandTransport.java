package transport;

public class LandTransport extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;

    public LandTransport(int power, int maxSpeed, int mass, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, mass, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
