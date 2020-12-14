package homeWork.transport;

public class Transport {
    private int horsepower;
    private int maxSpeed;
    private  int mass;
    private String brand;

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
        System.out.println("Мощность "+horsepower+" л.с. или");
        System.out.println(" Макс.скорость "+ maxSpeed+ " км/ч");
        System.out.println(" Масса " + mass+" кг");
        System.out.println("Марка "+brand);
        System.out.println("Мощность "+perevod(horsepower));

    }

    public static void main(String[] args) {
        Transport transport = new Transport(500,150,1000,"Жигули");
        LandTransport f = new LandTransport(300,200,1200,"f",4,8);
    }
}
