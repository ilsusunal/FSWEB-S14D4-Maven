package org.example.rpg;

import org.example.rpg.interfaces.Bleedable;
import org.example.rpg.interfaces.Burnable;

public class Dragon extends Monster implements Burnable, Bleedable {
    public Dragon(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + burn();
    }

    @Override
    public double burn() {
        return getDamage()*0.5;
    }

    @Override
    public double bleed() {
        return getDamage()*0.2;
    }
}
