package homeWork;

public class HomeWork9 {
    public static void main(String[]args){
    task1();
    task2();

    }
    public static  void task1(){
        String str = "sdagtybrt";
        cut(str, 'a', 'b');
    }
    public static void cut(String stroka, char a, char b){
        int pozition1 = stroka.indexOf(a);
        int pozition2 = stroka.lastIndexOf(b);
        String s = stroka.substring(pozition1, pozition2+1);
        System.out.println(s);
    }

    public static void task2(){
zamena( "Мама мыла раму");
    }
    public static void zamena(String stroka){
        String[]str = stroka.split(" ");
        for(int i = 0; i<str.length; i++){
            if(str[i].length()>3){
                char first = str[i].charAt(0);
                char second = str[i].charAt(3);
                str[i] = str[i].replace(second, first);
            }
        }
        String s = "";
        for (int i = 0; i < str.length; i++) {
            s = s.concat(str[i]+" ");
        }
        System.out.println(s);
    }


}
