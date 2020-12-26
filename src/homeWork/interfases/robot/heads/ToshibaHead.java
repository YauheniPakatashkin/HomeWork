package homeWork.interfases.robot.heads;

public class ToshibaHead implements  IHeads{
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }
    public ToshibaHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Тосиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
