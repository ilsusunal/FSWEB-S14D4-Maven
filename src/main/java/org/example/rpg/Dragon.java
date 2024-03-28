package org.example.rpg;

public class Dragon extends Monster{
    public Dragon(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return 0;
    }
}
