package homeWork.interfases.robot.heads;

public class SamsungHead implements  IHeads{
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }
    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Самсунг");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
