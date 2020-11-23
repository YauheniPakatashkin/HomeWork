package homeWork2;


public class lesson2 {
    public static void main(String[] args) {
        //Задача 1
        double s = 10;
        double rezult = 0;
        for (int i = 0; i < 7; i++) {
            rezult += s;
            s = s * 1.1;
        }
        System.out.println("Суммарный путь за 7 дней: " + rezult + " км");

        //Задача 2
        int ameba = 1;
        for (int i = 0; i < 25; i += 3) {
            System.out.print(" " + ameba);
            ameba *= 2;
        }
        System.out.println(" амёб");

        //Задача 3
        int summa = 0;
        for (int i = 1; i < 257; i *= 2) {
            summa += i;
        }
        System.out.println("1+2+4+8+..+256 = " + summa);

        //Задача 4
        System.out.println(rezultat(6, 6));//метод описан ниже

        //Задача 5

    }

    public static int rezultat(int a, int b) { //метод к задаче 4, умножение заменяем сложением
        int c = 0;
        for (int i = 0; i < b; i++) {
            c +=a;
        }
        return c;
    }
}