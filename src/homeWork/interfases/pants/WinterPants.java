package homeWork.interfases.pants;

public class WinterPants implements Pants {
    public WinterPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеваем зимние штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем зимние штаны");
    }
}
