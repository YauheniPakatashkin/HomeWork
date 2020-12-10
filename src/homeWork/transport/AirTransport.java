package homeWork.transport;

public class AirTransport extends Transport{
    private int wingspan;
    private int minStripLength;

    public AirTransport(int power, int maxSpeed, int mass, String brand, int wingspan, int minStripLength) {
        super(power, maxSpeed, mass, brand);
        this.wingspan = wingspan;
        this.minStripLength = minStripLength;
    }
}
