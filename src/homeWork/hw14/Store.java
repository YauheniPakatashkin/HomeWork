package homeWork.hw14;

import java.util.ArrayList;

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

    public void getAllProducts(){
        for (Product i: productList){
            System.out.println(i.getId()+" "+i.getName()+" "+ i.getPrice());
        }
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
