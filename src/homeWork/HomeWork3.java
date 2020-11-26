package homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //Task 1
        int [] array = new int[10];
        int count = 2;
        for (int i = 0; i < array.length; i++) {
            array [i] = count;
            count+=2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Task 2
        int [] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
            int count1 = i*2+1;
            array1[i] = count1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        for (int i = array1.length-1; i >=0; i--) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }
        System.out.println(2);
        //Task 3
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int even = 0;
        System.out.println("Введите длину массива");
        int arrayLength = scanner.nextInt();
        int [] array2 = new int[arrayLength];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
            if(array2[i]!= 0 && array2[i]%2==0){
                even++;
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("Количество чётных чисел в массиве "+even);

        //Task4





    }
}
