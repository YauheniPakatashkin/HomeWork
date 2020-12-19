package homeWork.transport;

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean buisnessClass;

    public CivilTransport(int horsepower, int maxSpeed, int mass, String brand, int wingspan, int minStripLength, int numberOfPassengers, boolean buisnessClass) {
        super(horsepower, maxSpeed, mass, brand, wingspan, minStripLength);
        this.numberOfPassengers = numberOfPassengers;
        this.buisnessClass = buisnessClass;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Количество пассажиров "+ numberOfPassengers);
        System.out.println("Наличие бизнесс-класса "+ buisnessClass);
    }
    public void mesta(int passagers){
        if(passagers<=numberOfPassengers)
            System.out.println("Все в порялке");
        else System.out.println("Мест нет");
    }
}
