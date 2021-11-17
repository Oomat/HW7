package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(60);
        setSuperAbilityType("VENOM");
        System.out.println("VENOM" + "\n" + "HP:" + getHp() + "\n" + "DAMAGE" + getDamage() + "\n" + "СУПЕР СПОСОБНОСТЬ:" + getSuperAbilityType() );
    }
}
