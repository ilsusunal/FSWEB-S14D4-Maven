package org.example.model;

import org.example.model.enums.BreadType;
import org.example.model.enums.ChocoFlavor;
import org.example.model.enums.ChocoIngredient;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[4];
        products[0] = new Chocolate("junk", 10, "chocolate", ChocoFlavor.DARK, ChocoIngredient.CARAMEL);
        products[1] = new Coke("beverage", 15, "coke", false);
        products[2] = new Coke("beverage", 15, "coke", true);
        products[3] = new Bread("grain", 5, "bread", BreadType.MULTIGRAIN, false);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i = 0 ; i < products.length; i++){
            products[i].showDetails();
        }
    }
}