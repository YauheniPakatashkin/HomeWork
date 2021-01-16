package homeWork.hw10;

public class MyException extends Exception{
     private int i;

    public MyException(int i) {
        i = i;
    }
    public String toString(){
        return " Четное число "+i;
    }
}
