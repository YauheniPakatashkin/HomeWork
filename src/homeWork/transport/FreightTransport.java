package homeWork.transport;

public class FreightTransport extends LandTransport {
    private int carrying;

    public FreightTransport(int horsepower, int maxSpeed, int mass, String brand, int numberOfWheels, int fuelConsumption, int carrying) {
        super(horsepower, maxSpeed, mass, brand, numberOfWheels, fuelConsumption);
        this.carrying = carrying;
    }
    private void sravnenie(int gruz) {
        if (carrying >= gruz)
            System.out.println("Грузовик загружен");
            else
            System.out.println("Вам нужен грузовик побольше");

    }
}
