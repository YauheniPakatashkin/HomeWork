package homeWork.interfases.robot;
import homeWork.interfases.robot.hands.SamsungHand;
import homeWork.interfases.robot.hands.SonyHand;
import homeWork.interfases.robot.hands.ToshibaHand;
import homeWork.interfases.robot.heads.SonyHead;
import homeWork.interfases.robot.heads.SamsungHead;
import homeWork.interfases.robot.heads.ToshibaHead;
import homeWork.interfases.robot.legs.SamsungLeg;
import homeWork.interfases.robot.legs.SonyLeg;
import homeWork.interfases.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SamsungHead(400),new ToshibaHand(300), new SonyLeg(600),"робот1");
        Robot robot2 = new Robot(new SonyHead(700), new SamsungHand(400), new ToshibaLeg(300), "робот2");
        Robot robot3 = new Robot(new ToshibaHead(300), new SonyHand(600), new SamsungLeg(3400), "робот3");
        robot1.action();
        robot2.action();
        robot3.action();
        System.out.println("Самый дорогой робот " +getExpensiveRobot(robot1,robot2,robot3).getName()+" "+ getExpensiveRobot(robot1,robot2,robot3).getPrice());
    }
    private static Robot getExpensiveRobot(Robot a, Robot b, Robot c){
        if(a.getPrice()>b.getPrice() && a.getPrice()>c.getPrice())
            return a;
        else if (b.getPrice()>a.getPrice()&& b.getPrice()>c.getPrice())
            return b;
        else return c;
    }
}
