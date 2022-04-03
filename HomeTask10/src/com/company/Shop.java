package com.company;

import java.util.*;

public class Shop {
    private List<Product> listProduct = new ArrayList<>();

    public void addProduct(Product prod){
        for(Product p: listProduct){
            if(p.getId() == prod.getId()){
                return;
            }
        }
        listProduct.add(prod);
    }

    public void deleteProduct(int id){
        Iterator<Product> iter = listProduct.iterator();
        while(iter.hasNext()){
            Product prod = iter.next();
            if(prod.getId() == id){
                listProduct.remove(prod);
                return;
            }
        }
        //listProduct.removeIf(p-> (p.getId() == id)); - вот такое ещё быстрое списала с инета)))), как вариант,
        //но он мне не понятен!
    }

    public void comparePrice(){
        listProduct.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()- o2.getPrice();
            }
        });


        //listProduct.sort(Comparator.comparing(Product :: getPrice));
    }

    public void sort(){
        Collections.reverse (listProduct);
    }

    public void editProduct(Product prod){
        for(Product p: listProduct){
            if (p.getId() == prod.getId()){
                listProduct.set(listProduct.indexOf(p), prod);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Product p : listProduct) {
            str.append(p).append("\n");
        }
        return "\n" + str;
    }

}
