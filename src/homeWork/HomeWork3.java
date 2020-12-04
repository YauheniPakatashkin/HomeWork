package homeWork;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        int[] array = new int[10];
        int count = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count += 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(" ");
    }

    public static void task2() {
        int[] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
            int count1 = i * 2 + 1;
            array1[i] = count1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int even = 0;
        System.out.println("Введите длину массива 15");
        int arrayLength = scanner.nextInt();
        int[] array2 = new int[arrayLength];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
            if (array2[i] != 0 && array2[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("Количество чётных чисел в массиве " + even);
        System.out.println(" ");
    }

    public static void task4() {
        int[] array3 = new int[20];
        Random random = new Random();
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 != 0) {
                array3[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array3));
        System.out.println(" ");
    }

    public static void task5() {

        int[] array = new int[5];
        int[] array1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(16);
            array1[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        int a = 0, b = 0;
        for (int i = 0; i < 5; i++) {
            a += array[i];
            b += array1[i];
        }
        double c = a / 5;
        double d = b / 5;
        System.out.println("Среднее арифметическое первого массива " + c);
        System.out.println("Среднее арифметическое первого массива " + d);
        if (c > d) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        if (c < d) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        if (c == d) {
            System.out.println("Средние арифметические массивов равны");
        }
        System.out.println(" ");

    }

    public static void task6() {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(11);
        }
        int count = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        if (count == array.length - 1) {
            System.out.println("является");
        } else {
            System.out.println("не является");
        }
        System.out.println(" ");

    }

    public static void task7() {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (array[i] == max) {
                index = i;
            }
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Индекс последнего вхождения в массив " + index);
        System.out.println(" ");
    }

    public static void task8() {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
            array3[i] = (double) array1[i] / array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println("Количество целых чисел в третьем массиве: " + count);
        System.out.println(" ");
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите положительное число");
        int a = scanner.nextInt();
        while (a < 0) {
            System.out.println("Вы ввели неподходящее число. Введите положительное число.");
            a = scanner.nextInt();
        }
        int[] mass = new int[a];
        for (int i = 0; i < a; i++) {
            mass[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(mass));
        int summ1 = 0, summ2 = 0;
        if (a % 2 == 0) {
            for (int i = 0; i < a / 2; i++) {
                summ1 += mass[i];
            }
        } else {
            for (int i = 0; i <= a / 2; i++) {
                summ1 += mass[i];
            }
        }
        for (int i = a / 2; i < a; i++) {
            summ2 += mass[i];
        }
        System.out.println("Сумма первой половины " + summ1);
        System.out.println("Сумма второй половины " + summ2);
        if (summ1 > summ2) {
            System.out.println("Сумма первой половины массива больше");
        }
        if (summ1 < summ2) {
            System.out.println("Сумма второй половины массива больше");
        }
        if (summ1 == summ2) {
            System.out.println("Суммы первой и второй половин массива равны");
        }
        System.out.println(" ");
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число больше трех");
        int n = scanner.nextInt();
        while (n<=3){
            System.out.println("Вы ввели неподходящее число");
            n = scanner.nextInt();
        }
        int [] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = random.nextInt(n+1);
        }
        System.out.println(Arrays.toString(mass));
        int even = 0;
        for (int i = 0; i < n; i++) {
            if(mass[i]%2==0){
                even++;
            }
        }
        if(even>0){
            int[]massEven = new int[even];
            for (int i = 0; i < even; i++) {
                for (int j = 0; j < n; j++) {
                    if(mass[j]%2==0){
                        massEven[i]=mass[j];
                        i++;
                    }
                }
            }
            System.out.println(Arrays.toString(massEven));
        }
        else {
            System.out.println("В массиве нет четных чисел");
        }
    }
}

