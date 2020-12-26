package homeWork.interfases.robot.hands;

public class ToshibaHand implements IHands {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }
    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднять руку тосиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
