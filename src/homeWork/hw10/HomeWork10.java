package homeWork.hw10;

public class HomeWork10 {
    public static void main(String[] args) {
     Car car = new Car("sport", 0,0);
        Car car1 = new Car("sport1", 0,0);
        Car car2 = new Car("sport2", 0,0);
        Car car3 = new Car("sport3", 0,0);

        try {
            car.start();
            car1.start();
            car2.start();
            car3.start();
        } catch (MyException myException) {
            myException.printStackTrace();
        }
    }

}
