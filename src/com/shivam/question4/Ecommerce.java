package com.shivam.question4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ecommerce {

    List<Product> productList=new ArrayList<>();
    Set<Product> productsSet=new HashSet<>();

    public void addProduct(Product product){

        if(productList.contains(product)){
            for(Product p :productList){

                if(product.equals(p)){
                    p.setCount(p.getCount()+product.getCount());
                }
            }
            System.out.println("Count is updated");
        }
        else{
            productList.add(product);
            System.out.println("Product is successfully added");
        }
    };

    public List<Product> showAllProduct(){
        return productList;
    };
}

class MainProduct{
    public static void main(String[] args) {
        Ecommerce ecommerce=new Ecommerce();
        ecommerce.addProduct(new Product("Shoes",2000,"Adidas",12));
        ecommerce.addProduct(new Product("Ipad",100000,"Apple",2));
        ecommerce.addProduct(new Product("Ipad",100000,"Apple",4));
        ecommerce.addProduct(new Product("Shoes",4000,"Nike",4));
        ecommerce.addProduct(new Product("Shoes",2000,"Adidas",8));
        System.out.println(ecommerce.showAllProduct());
    }
}