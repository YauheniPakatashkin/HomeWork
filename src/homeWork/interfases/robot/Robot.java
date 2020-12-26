package homeWork.interfases.robot;
import homeWork.interfases.robot.hands.IHands;
import homeWork.interfases.robot.heads.IHeads;
import homeWork.interfases.robot.legs.ILegs;

public class Robot implements IRobot{
    private IHeads head;
    private IHands hand;
    private ILegs leg;
    private String name;

    public Robot(IHeads head, IHands hand, ILegs leg, String name) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.name = name;
    }

    public Robot(){}

    public IHeads getHead() {
        return head;
    }

    public void setHead(IHeads head) {
        this.head = head;
    }

    public IHands getHand() {
        return hand;
    }

    public void setHand(IHands hand) {
        this.hand = hand;
    }

    public ILegs getLeg() {
        return leg;
    }

    public void setLeg(ILegs leg) {
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
