package homeWork.interfases.robot.legs;

public class SonyLeg implements ILegs {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
