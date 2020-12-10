package homeWork.transport;

public class FreightTransport extends LandTransport {
    private int carrying;

    public FreightTransport(int power, int maxSpeed, int mass, String brand, int numberOfWheels, int fuelConsumption, int carrying) {
        super(power, maxSpeed, mass, brand, numberOfWheels, fuelConsumption);
        this.carrying = carrying;
    }
}
