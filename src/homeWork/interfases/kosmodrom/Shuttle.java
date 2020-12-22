package homeWork.interfases.kosmodrom;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean controlSystems(){
        Random random = new Random();
        int i = random.nextInt(11);
        if (i > 3)
            return true;
        else
            return false;
    }


    @Override
    public void startEngine(){
        System.out.println("Двигатели шаттла запущены. Все системвы в норме.");
    }

    @Override
    public void start(){
        System.out.println("Старт шаттла");
    }
}
