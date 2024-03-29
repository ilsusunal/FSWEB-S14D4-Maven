package org.example.rpg;

public class Arena {
    public static void main(String[] args) {
        Monster iceTroll = new Troll("Icyy", 20, 50);
        Monster dragon = new Dragon("Ladon", 50, 60);

        showAttacks(iceTroll);
        showAttacks(dragon);
    }
    public static void showAttacks(Monster monster){
        System.out.println(monster.getName() + String.format(" the %s can hit you with -> ", monster.getClass()) + monster.attack());

    }
}
