package homeWork.interfases.kosmodrom;


import java.util.Random;
import java.util.Scanner;


public class Falcon implements IStart {
    @Override
    public boolean controlSystems() {
        Random random = new Random();
        int i = 1234;
        System.out.println("Введите ключ запуска");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (i == a)
            return true;
        else
            return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели ракеты запущены. Все системвы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт ракеты");
    }
}
