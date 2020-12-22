package homeWork.interfases;

import homeWork.interfases.footWear.FootWear;
import homeWork.interfases.footWear.SportShoes;
import homeWork.interfases.jakets.Jacket;
import homeWork.interfases.jakets.WinterJacket;
import homeWork.interfases.pants.Pants;
import homeWork.interfases.pants.WinterPants;

public class Human implements Jacket, Pants, FootWear {
    private String name;
    private Jacket jacket;
    private  Pants pants;
    private FootWear footWear;

    public String getName() {
        return name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public FootWear getFootWear() {
        return footWear;
    }

    public Human(String name, Jacket jacket, Pants pants, FootWear footWear) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.footWear = footWear;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        footWear.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        footWear.takeOff();
    }

    public static void main(String[] args) {
        Human human1 = new Human("vovv", new WinterJacket(),new WinterPants(), new SportShoes());
        human1.putOn();
        human1.takeOff();

    }
}

