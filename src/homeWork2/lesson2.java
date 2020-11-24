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
        int duim = 0;
        String w = null;
        String v = null;
        for (int i = 1; i < 21; i++) {
            duim=+i;
            if (duim==1){ w = "дюйм"; v = "равен";}
            if (duim>1 && duim<5){ w = "дюйма"; v = "равны";}
            if (duim>4) { w = "дюймов"; v = "равны";}
            System.out.println(duim+" "+w+" "+v+" "+perevodDuimVsantimetr(duim)+" см");
        }

        //Задача 6
        int p =2;
        for (; p <101 ; p++) {
            if (p % 2 == 0) {
                System.out.print(p+" ");
            }
        }
        System.out.println("");
        //Задача 7
        int count1 = 0;
        for (int i = 0; i <100; i++) {
            if(i%2!=0)
                count1+=i;
        }

        System.out.println("Сумма нечетных чисел от 1 до 99 равна "+ count1);

        //Задача 8
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

        }


    }

    public static int rezultat(int a, int b) { //метод к задаче 4, умножение заменяем сложением
        int c = 0;
        for (int i = 0; i < b; i++) {
            c +=a;
        }
        return c;
    }
    public static double perevodDuimVsantimetr(int duim) { //метод к задаче 5, пеервод дюймов в сантиметры
        double sm = duim*2.54;
        return sm;
    }
}