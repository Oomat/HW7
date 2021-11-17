package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(40);
        setSuperAbilityType("FIRE");
        System.out.println("MAGIC" + "\n" + "HP:" + getHp() + "\n" + "DAMAGE" + getDamage() + "\n" + "СУПЕР СПОСОБНОСТЬ:" + getSuperAbilityType() );
    }
}
