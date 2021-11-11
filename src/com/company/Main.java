package com.company;

public class Main {

    public static void main(String[] args) {
        Boss murat = new Boss();
        murat.setHealth(500);
        murat.setDamage(200);
        murat.setName("Murat");

        System.out.println(murat.getName() + " : " + murat.getHealth() + " жизнь," + murat.getDamage() + " урон  ");
        System.out.println(murat.printinfo());
        Sceleton sceleton1 = new Sceleton();
        sceleton1.setStrely(10);
        sceleton1.setHealth(600);
        sceleton1.setDamage(150);
        sceleton1.setName("skelet1");

        Sceleton sceleton2 = new Sceleton();
        sceleton2.setStrely(15);
        sceleton2.setHealth(550);
        sceleton2.setDamage(300);
        sceleton2.setName("scelet2");
        System.out.println(sceleton1.printinfo());
        System.out.println(sceleton2.printinfo());
    }
}
