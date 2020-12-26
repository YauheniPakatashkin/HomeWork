package homeWork.interfases.robot.legs;

public class ToshibaLeg implements  ILegs{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога тосиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
