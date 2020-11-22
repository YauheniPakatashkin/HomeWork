package com.company;

public class Main {

    public static void main(String[] args) {
        // задача 1
        int i = -100;
        if(i>0 && i<10)
            System.out.println("Это однозначное положительное число");
        if(i>0 && i>9 && i<100)
            System.out.println("Это двухзначное положительное число");
        if(i>0 && i>100)
            System.out.println("Это трехзначное и более положительное число");
        if(i<0 && i>-10)
            System.out.println("Это однозначное отрицательное число");
        if(i<0 && i<-9 && i>-100)
            System.out.println("Это двухзначное отрицательное число");
        if(i<0 && i<-99)
            System.out.println("Это трехзначное и более отрицательное число");


       // Задача 2
        int a = 1;
        int b = 2;
        int c = 3;
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Треугольник с такими сторонами существует.");
        else if (c >= a + b)
            System.out.println("Треугольник с такими сторонами не существует.");
        if (a >= c + b)
            System.out.println("Треугольник с такими сторонами не существует.");
        if (b >= c + a)
            System.out.println("Треугольник с такими сторонами не существует.");


        //Задача 3
        int q = -3;
        if(q>0){
            q=q+1;
        }
        if(q<0){
            q=q-2;
        }
        if(q==0) {
            q = 10;

        }
        System.out.println("Полученное число " + q);

        //Задача 4
        int z = 2;
        int x = 3;
        int v = -3;
        int count=0;
        if (z>0) count++;
        if (x>0) count++;
        if (v>0) count++;
        System.out.println("Количество положительных чисел: " + count);

        //Задача5
        //За основу беру переменные и переменную-счетчик положительных чисел из задачи 4
        int count1 = 0;
        if (z<0) count1++;
        if (x<0) count1++;
        if (v<0) count1++;
        System.out.println("Кол-во отрицательных чисел: " + count1);
        System.out.println("Кол-во положительных чисел:  " + count);

        // Задача 6
        int n = 200;
        int m = 300;
        if(n>m)
            System.out.println("Большее число "+ n);
        else
            System.out.println("Большее число " + m);
        if (n==m)
            System.out.println("Числа равны");


        //Задача7
        int u = 15;
        if(u%100>10 && u%100<=15)
            System.out.println(u + " программистов");
        else  if (u%10==1)
            System.out.println(u + " программист");
        else if (u%10>1 && u%10<5)
            System.out.println(u + " программиста");
        else if (u%10>4 || u%10==0)
            System.out.println(u+ " программистов");
    }
}

