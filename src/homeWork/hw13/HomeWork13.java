package homeWork.hw13;

import java.io.*;
import java.util.ArrayList;

public class HomeWork13 {
    public static void main(String[] args)  {
     try {
         Car car = new Car("BMW", 230, 20000);
         Car test = task4(car);
         System.out.println(test.brand+" "+test.cost+test.speed);
         //task3();
     }
     catch (Exception e){

     }
    }

    void task1() {

    }

    void task2() {

    }

    static void task3() throws Exception {
        File text = new File("C:/Users/Евгений/IdeaProjects/HomeWork/src/homeWork/hw13/Text");
        File blackList = new File("C:/Users/Евгений/IdeaProjects/HomeWork/src/homeWork/hw13/BlackList");
        BufferedReader reader = new BufferedReader(new FileReader(text));
        BufferedReader reader1 = new BufferedReader(new FileReader(blackList));
        ArrayList<String> fileText = new ArrayList<>();
        ArrayList<String> blText = new ArrayList<>();
        ArrayList<String> wrongText = new ArrayList<>();
        int count = 0;
        while (reader.ready()) {
            fileText.add(reader.readLine());
        }
        while (reader1.ready()) {
            blText.add(reader1.readLine());
        }
        for (String words : fileText) {
            label:
            {
                String[] mass = words.split(" ");
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < blText.size(); j++) {
                        if (mass[i].equals(blText.get(j))) {
                            count++;
                            wrongText.add(words);
                            break label;
                        }
                    }
                }

            }
        }
        if(count==0){
            System.out.println("Текст прошел цензуру");
        }
        else{
            System.out.println("Текст не прошел проверку");
            System.out.println("Количество неправильных предложений "+count);
            for (String predlog: wrongText){
                System.out.println(predlog);
            }
        }

    }
    static Car task4(Car save) throws IOException, ClassNotFoundException {
        FileOutputStream outputStream = new FileOutputStream("C:/Users/Евгений/IdeaProjects/HomeWork/src/homeWork/hw13/ddd.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        FileInputStream fileInputStream = new FileInputStream("C:/Users/Евгений/IdeaProjects/HomeWork/src/homeWork/hw13/ddd.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        objectOutputStream.writeObject(save);
        objectOutputStream.close();

        return  (Car) objectInputStream.readObject();
    }
}
