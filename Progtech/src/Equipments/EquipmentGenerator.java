package Equipments;

import Creatures.Creature;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentGenerator {

    public WeaponCreator wc = new WeaponCreator();

    public void EquipWeapon(ArrayList<Creature> creatures) {
        for(Creature c : creatures) {
            if(c.getPartyMember() == true) {
                System.out.println(c.getName() + " what weapon would you like to use?\n1)Longsword   2)Knight sword   3)Battle axe   4)Short sword   5)Sabre\n " +
                        "6)Headhunter sword   7)Slan sword   8)Pickaxe   9)Flail");
                Scanner sc = new Scanner(System.in);


                int aa = sc.nextInt();
                System.out.println("What is your skill level for the selected weapon?\n1)No skill   2)Basic skill   3)Master skill");
                int bb = sc.nextInt();
                System.out.println("Is the weapon magically modified?\n1)No   2)Blessed");
                int dd = sc.nextInt();
                String a = String.valueOf(aa);
                String b = String.valueOf(bb);
                String d = String.valueOf(dd);
                String x = (a + b + d);
                IEquipment weapon = wc.WeaponCreator(x);
                System.out.println("You choose: " + weapon.EquipmentName() + " " + weapon.ModifyOnDP() + " " + weapon.ModifyOnIP() + " " + weapon.ModifyOnAP() + ".");
                c.InitiativeWithEquipment(weapon.ModifyOnIP());
                c.AttackWithEquipment(weapon.ModifyOnAP());
                c.DefenceWithEquipment(weapon.ModifyOnDP());
                c.getCombat_points().setWeapon_index(weapon.DamageIndex());
            }
        }
    }
}
