package com.company;

public class Main {

    public static void main(String[] args) {

    Magic magic = new Magic();
    magic.setHealth(220);
    magic.setDamage(40);
    magic.setSuperpower("Magic");

    Medic medic = new Medic();
    medic.setHealth(200);
    medic.setDamage(30);
    medic.setSuperpower("Medic");

    Warrior warrior = new Warrior();
    warrior.setHealth(250);
    warrior.setDamage(15);
    warrior.setSuperpower("Warrior");


    Hero[] hero = {magic, medic, warrior};

        for (Hero heroes : hero) {
            heroes.applySuperAbility(heroes.getSuperpower());
        }

    }

}
