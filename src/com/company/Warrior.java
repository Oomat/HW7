package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(50);
        setSuperAbilityType("CRITICAL DAMAGE");
        System.out.println("WARRIOR" + "\n" + "HP:" + getHp() + "\n" + "DAMAGE" + getDamage() + "\n" + "СУПЕР СПОСОБНОСТЬ:" + getSuperAbilityType() );
    }
}
