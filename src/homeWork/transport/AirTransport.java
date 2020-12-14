package homeWork.transport;

public class AirTransport extends Transport{
    private int wingspan;
    private int minStripLength;

    public AirTransport(int horsepower, int maxSpeed, int mass, String brand, int wingspan, int minStripLength) {
        super(horsepower, maxSpeed, mass, brand);
        this.wingspan = wingspan;
        this.minStripLength = minStripLength;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Размах крыльев "+ wingspan+ " м");
        System.out.println("Минималная длина ВПП " + minStripLength+ " м");
    }
}
