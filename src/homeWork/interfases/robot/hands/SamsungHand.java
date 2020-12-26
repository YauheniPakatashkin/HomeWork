package homeWork.interfases.robot.hands;

public class SamsungHand implements IHands {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднять руку самсунг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
