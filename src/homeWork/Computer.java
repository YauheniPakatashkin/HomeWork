package homeWork;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String core;
    private int memory;
    private int hardDisk;
    private int cycle;
    private int count = 0; //счетчик включений/выключений
    private boolean power; //работает/не работает
    private boolean sgorel; // сгорел/не сгорел
    private  static Random random = new Random();

    public static void main(String[] args) {
        Computer comp = new Computer("Intel", 1024, 500, 5);
        description(comp);
        on(comp);
        off(comp);
        on(comp);
        off(comp);
        on(comp);
        off(comp);
        on(comp);
    }

    Computer(String core, int memory, int hardDisk, int cycle) {
        this.core = core;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.cycle = cycle;
    }

    public static void description(Computer comp) {
        System.out.println("Процессор: " + comp.core + "; Оперативная память: " + comp.memory + "Мб; Жесткий диск: " + comp.hardDisk + " Гб; " + "Количество циклов: " + comp.cycle);

    }

    public static void on(Computer comp) {
        System.out.println("[Попытка включить]");

        if (!comp.sgorel) {                               //проверяем сгоревший или нет
            if (comp.cycle > comp.count) {               //проверяем не превышено ли количество циклов включений и выключений
                if (comp.power == false) {               //проверяем не работает ли уже компьютер
                    Scanner scanner = new Scanner(System.in);
                    int a = random.nextInt(2);
                    // int a =1; для теста
                    System.out.println("Введите число 0 или 1");
                    int b = scanner.nextInt();
                    while (b < 0 || b > 1) {
                        System.out.println("Вы ввели неверное число. Введите заново");
                        b = scanner.nextInt();
                    }
                    if (a == b) {
                        System.out.println("Компьютер включился");
                        comp.power = true;
                        comp.count++;
                    } else {
                        System.out.println("Компьютер сгорел");
                        comp.sgorel = true;
                    }
                }
            } else
                System.out.println("Ресурс исчерпан. Компьютер сгорел");
        } else
            System.out.println("Компьютер уже сгорел");
    }

    public static void off(Computer comp) {
        System.out.println("[Попытка выключить]");
        if (comp.sgorel == false) {
            if (comp.cycle > comp.count) {
                if (comp.power == true) {
                    Scanner scanner = new Scanner(System.in);
                    int a = random.nextInt(2);
                    // int a = 1; для теста
                    System.out.println("Введите число 0 или 1");
                    int b = scanner.nextInt();
                    while (b < 0 || b > 1) {
                        System.out.println("Вы ввели неверное число. Введите заново");
                        b = scanner.nextInt();
                    }
                    if (a == b) {
                        System.out.println("Компьютер выключился");
                        comp.power = false;
                        comp.count++;
                    } else {
                        System.out.println("Компьютер сгорел");
                        comp.sgorel = true;
                    }
                }
            } else
                System.out.println("Ресурс исчерпан. Компьютер сгорел");
        } else
            System.out.println("Компьютер уже сгорел");

    }
}
