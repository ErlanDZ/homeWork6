package com.company;

public class Boss extends GameEntit {
    protected Weapon weapon;



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo (){
        return super.printInfo()  + "\n "
                + "Оружие - " + weapon.getSniper() + ", "+ " Модель -" + weapon.getSvd() ;
    }

}
