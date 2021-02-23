package homeWork.hw14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Store {
     ArrayList<Product> productList = new ArrayList<>();



    public void addProduct( Product product) {
        boolean ecv = false;
       for(Product i: productList){
           if(i.getId()==product.getId()){
               ecv = true;
               System.out.println("Такой продукт уже есть.");
               break;
           }
       }
       if(!ecv){
           productList.add(product);
       }
    }

    public ArrayList<Product> getAllProducts(){
        ArrayList<Product> rezult= new ArrayList<>();
        rezult.addAll(0,productList);
        return rezult;
    }

    public void deleteProduct(int id){
        for (Product i: productList){
            if(i.getId()==id){
                productList.remove(i);
                break;
            }
            else{
                System.out.println("Продукт с таким id отсутствует");
            }
        }
    }

    public void redactingProducts(Product product){
        for (Product i: productList){
            if(i.getId()==product.getId()){
                i.setName(product.getName());
                i.setPrice(product.getPrice());
                break;
            }
            else{
                System.out.println("Такого продукта нет в списке");
            }
        }
    }

}
