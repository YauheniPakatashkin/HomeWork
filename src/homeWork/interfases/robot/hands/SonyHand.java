package homeWork.interfases.robot.hands;

public class SonyHand implements IHands {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднять руку Сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
