package org.example.model;

public class Coke extends ProductForSale{
    private boolean isDiet;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        if(isDiet) {
            System.out.println("Your coke is diet.");
        } else {
            System.out.println("Your coke is NOT diet.");
        }
    }
}
