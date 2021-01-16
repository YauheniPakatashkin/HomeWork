package homeWork.hw10;

import java.util.Random;

public class Car {
    private String brand;
    private  int speed;
    private  int cost;

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }
    public Car() {
    }

    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    public int getCost() {
        return cost;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    protected void start() throws MyException {
        Random random= new Random();
        int i = random.nextInt(21);
        if(i%2==0){
            throw new MyException(i);
        }
        else System.out.println("Автомобиль "+getBrand()+" завелся.");
    }
}
