package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(1000);
	boss.setDamage(100);
	boss.setWeapon(new Weapon("Ружье", " Benelli M4 Super 90 "));
		System.out.println("Жизнь Босса -" + boss.getHealth() + " ед. " + ", " + "Урон Босса -" + boss.getDamage() + ", " +
				" ед. " + "Оружие Босса - " + boss.weapon.getSniper() + " " + boss.weapon.getSvd() + ", ");


		System.out.println("БОСС");
		System.out.println(boss.printInfo());



		System.out.println("----------------------------------------");
		System.out.println("Skeleton");


		Skeleton skeleton = new Skeleton();
		skeleton.setHealth(500);
		skeleton.setDamage(60);
		skeleton.setWeapon(new Weapon("АРБАЛЕТ", "УБОЙНЫЙ"));
		skeleton.setNumberOfArrows(50);
		System.out.println(skeleton.printInfo());



		System.out.println("_________________________________________");
		System.out.println("Skeleton1");


		Skeleton skeleton1 = new Skeleton();
		skeleton1.setHealth(400);
		skeleton1.setDamage(50);
		skeleton1.setWeapon(new Weapon("ЛУК", "ОГНЕННЫЙ"));
		skeleton1.setNumberOfArrows(40);
		System.out.println(skeleton1.printInfo());

    }


}
