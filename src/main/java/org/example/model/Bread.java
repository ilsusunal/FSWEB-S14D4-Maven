package org.example.model;

import org.example.model.enums.BreadType;

public class Bread extends ProductForSale{
    private BreadType breadType;
    private boolean isGlutenFree;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, BreadType breadType, boolean isGlutenFree) {
        super(type, price, description);
        this.breadType = breadType;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public void showDetails() {
        if(isGlutenFree) {
            System.out.println(String.format("Your bread is a %s one.", breadType) + "It's gluten free!");
        } else {
            System.out.println(String.format("Your bread is a %s one. ", breadType) + "Attention! It is NOT gluten free!");
        }
    }
}
