package transport;

public class LightTransport  extends LandTransport{
    private String bodyType;
    private int numberOfPassengers;

    public LightTransport(int power, int maxSpeed, int mass, String brand, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, mass, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }
}
