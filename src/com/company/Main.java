package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Warrior warrior = new Warrior();
        warrior.applySuperAbility();
        Medic medic = new Medic();
        medic.applySuperAbility();
        Magic magic = new Magic();
        magic.applySuperAbility();
    }
}
