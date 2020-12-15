package homeWork.transport;

public class Transport {
    protected int horsepower;
    protected int maxSpeed;
    protected  int mass;
    protected String brand;

    public Transport(int power, int maxSpeed, int mass, String brand) {
        this.horsepower = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }
    private static double perevod(int horsepower) {
        return horsepower * 0.74;
    }

    public  void description(){
        System.out.println("Мощность "+horsepower+" л.с. или "+perevod(horsepower)+" кВт ");
        System.out.println(" Макс.скорость "+ maxSpeed+ " км/ч");
        System.out.println(" Масса " + mass+" кг");
        System.out.println("Марка "+brand);
        System.out.println("Мощность "+perevod(horsepower));

    }

    public static void main(String[] args) {
        Transport transport = new Transport(500,150,1000,"Жигули");
        LightTransport car = new LightTransport(300,200,1200,"BMW",4,10,"sedan",4);
        car.description();
        car.distance(2);
    }
}
