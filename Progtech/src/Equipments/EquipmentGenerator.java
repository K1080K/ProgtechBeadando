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
                int aa = tryParse(sc,1, 9);
                System.out.println("What is your skill level for the selected weapon?\n1)No skill   2)Basic skill   3)Master skill");
                int bb = tryParse(sc,1, 3);
                System.out.println("Is the weapon magically modified?\n1)No   2)Blessed");
                int dd = tryParse(sc,1, 2);
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

    public boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int tryParse(Scanner sc, int min, int max){

        String s;
        int retVal;

        do{
            s = sc.nextLine();
            if (tryParseInt(s)){
                retVal = Integer.parseInt(s);
                if (min <= retVal && retVal <=  max){
                    return retVal;
                }
            }
        }while (true);
    }
}
