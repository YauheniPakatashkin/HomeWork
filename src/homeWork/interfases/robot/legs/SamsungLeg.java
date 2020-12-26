package homeWork.interfases.robot.legs;

public class SamsungLeg implements ILegs {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }
    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога самсунг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
