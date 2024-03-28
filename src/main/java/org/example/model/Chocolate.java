package org.example.model;

import org.example.model.enums.ChocoFlavor;
import org.example.model.enums.ChocoIngredient;

public class Chocolate extends ProductForSale{
    private ChocoFlavor flavor;
    private ChocoIngredient ingredient;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, ChocoFlavor flavor, ChocoIngredient ingredient) {
        super(type, price, description);
        this.flavor = flavor;
        this.ingredient = ingredient;
    }

    @Override
    public void showDetails() {
        System.out.println(String.format("Flavor of chocolate is : %s ", flavor) + "and " + String.format("It's main ingredient is : %s", ingredient));
    }
}
