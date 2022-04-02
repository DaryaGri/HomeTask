package com.company;

public class Main {

    public static void main(String[] args) {
        Shop clothes = new Shop();
        Product[] products = {new Product(11, "Hat", 20),
                new Product(11, "Gloves", 10),
                new Product(19, "Skirt", 60),
                new Product(81, "Pants", 40),
                new Product(2, "T-shirt", 7)};

        for(Product p: products){
            clothes.addProduct(p);
        }

        System.out.println("Список товаров с уникальными ID:" + clothes);

        clothes.sort();
        System.out.println("Список товаров в порядке добавления:" + clothes);

        clothes.deleteProduct(19);
        System.out.println("Список после удаления товара:" + clothes);

        clothes.comparePrice();
        System.out.println("Список товаров по возрастанию цены:" + clothes);

        clothes.editProduct(new Product(81, "Coat",85));
        System.out.println("Отредактированный писок товаров:" +clothes);

    }
}
