package homeWork.hw14;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork14 {
    public static void main(String[] args) {
    Store store = new Store();
    Product apple = new Product(1,"apple", 12);
    Product banana = new Product(2, "banana", 10);
    Product pear =  new Product(3, "pear", 4);
    store.addProduct(apple);
    store.addProduct(banana);
    store.addProduct(pear);
        ArrayList<Product> fff = new ArrayList<Product>();
        Collections.sort(store.getAllProducts());
         fff.addAll(0,);
    }


}
