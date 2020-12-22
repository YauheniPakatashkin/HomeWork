package homeWork.interfases.footWear;

public class SportShoes implements FootWear {
    public SportShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеваем кроссовки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем кроссовки");
    }
}
