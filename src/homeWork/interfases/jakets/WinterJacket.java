package homeWork.interfases.jakets;

public class WinterJacket implements Jacket {
    public WinterJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеваем зимнюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем зимнюю куртку");
    }
}
