package homeWork.hw9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork9 {
    public static void main(String[] args) throws Exception {
//        task1();
//        task2();
//        task3();
        task4();

    }

    public static void task1() {
        String str = "sdagtybrt";
        cut(str, 'a', 'b');
    }

    public static void cut(String stroka, char a, char b) {
        int pozition1 = stroka.indexOf(a);
        int pozition2 = stroka.lastIndexOf(b);
        String s = stroka.substring(pozition1, pozition2 + 1);
        System.out.println(s);
    }

    public static void task2() {
        zamena("Мама мыла раму");
    }

    public static void zamena(String stroka) {
        String[] str = stroka.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 3) {
                char first = str[i].charAt(0);
                char second = str[i].charAt(3);
                String part1 = str[i].substring(0, 3);
                String part2 = str[i].substring(3);
                part2 = part2.replaceFirst(String.valueOf(second), String.valueOf(first));
                str[i] = part1 + part2;
            }
        }
        String s = "";
        for (int i = 0; i < str.length; i++) {
            s = s.concat(str[i] + " ");
        }
        System.out.println(s);
    }

    public static void task3() throws Exception {
        File file = new File("C:/Users/Евгений/IdeaProjects/HomeWork/src/homeWork/text");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<StringBuilder> result = new ArrayList<>();
        while (reader.ready()) {
            list.add(new StringBuilder(reader.readLine()));
        }
        for (StringBuilder str : list) {
            if (str.toString().equals(str.reverse().toString())) {
                result.add(new StringBuilder(str));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static void task4() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Евгений/IdeaProjects/HomeWork/src/text2"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Евгений/IdeaProjects/HomeWork/src/result"));
        while (reader.ready()) {
            String st = reader.readLine();

            if (TextFormater.getPolindrom(st)) {
                writer.write(st);
                writer.newLine();
                System.out.println(st+" по полиндрому");
            } else if (TextFormater.getCount(st) >= 3 && TextFormater.getCount(st) <= 5) {
                writer.write(st);
                writer.newLine();

                System.out.println(st+"по количеству слов");
            }
        }
        reader.close();
        writer.close();
    }

    public static class TextFormater {
        public static int getCount(String str) {
            String[] mass = str.split(" ");
            return mass.length;
        }

        public static boolean getPolindrom(String str) {
            String[] mass = str.split(" ");
            ArrayList<StringBuilder> list = new ArrayList<>();
            ArrayList<StringBuilder> rezult = new ArrayList<>();
            for (String s : mass) {
                list.add(new StringBuilder(s));
                rezult.add(new StringBuilder(s));
            }

            for (StringBuilder s: rezult){
                s.reverse();
                System.out.println(s);
            }

            for (int i=0; i<list.size(); i++) {
                if (list.get(i).length() > 1) {
                    if (list.get(i).toString().equalsIgnoreCase(rezult.get(i).toString())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
