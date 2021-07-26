package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHeals(500);
        boss.setDamage(60);
        System.out.println("Heals:" + boss.getHeals());
        System.out.println("Damage:" + boss.getDamage());
        boss.setWeapon(new Weapon("zero"));
        System.out.println("Weapon"  +  boss.getWeapon());
        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();
        System.out.println("Skeleton;" + skeleton1.getArrows());
        System.out.println("Skeleton;" + skeleton2.getArrows());
    }
}
