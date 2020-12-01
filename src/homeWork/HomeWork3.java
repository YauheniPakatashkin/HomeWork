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
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int even = 0;
        System.out.println("Введите длину массива");
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
    }

    public static void task4() {
        int[] array3 = new int[20];
        Random random = new Random();
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 != 0) {
                array3[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array3));
    }

    public static void task5() {

        int[] array = new int[5];
        int[] array1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(15);
            array1[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        int a = 0, b = 0;
        for (int i = 0; i < 5; i++) {
            a += array[i];
            b += array1[i];
        }
        System.out.println(a);
        System.out.println(b);
        double c = a / 5;
        double d = b / 5;
        if (c > d) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        if (c < d) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        if (c == d) {
            System.out.println("Средние арифметические массивов равны");
        }
    }

    public static void task6() {
        while (true) {
            int[] array = new int[4];
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                array[i] = random.nextInt(10);
            }
            int count = 0;
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    count++;
                }
                System.out.println(count);

            }
            if (count == array.length - 1) {
                System.out.println("является");
                break;
            } else
                System.out.println("не является");
        }
    }

    public static void task7() {
        int[] array2 = new int[12];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array2));
        int max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (max < array2[i]) {
                max = array2[i];
            }
        }
        System.out.println(max);


    }
}

