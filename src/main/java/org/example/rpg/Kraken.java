package org.example.rpg;

public class Kraken extends Monster{
    public Kraken(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return 0;
    }
}
