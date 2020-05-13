package Equipments;

import Equipments.QualityAndEnchants.*;
import Equipments.SkillModifiers.*;
import Equipments.Weapons.*;

public class WeaponCreator {

    public IEquipment WeaponCreator(String x) {
        switch (x) {
            case "111":
                IEquipment weapon = new Longsword(new Equipment());
                return weapon;
            case "112":
                IEquipment weapon1 = new BlessedWeapon(new Longsword(new Equipment()));
                return weapon1;
            case "121":
                IEquipment weapon2 = new WeaponBasicSkill(new Longsword(new Equipment()));
                return weapon2;
            case "122":
                IEquipment weapon3 = new BlessedWeapon(new WeaponBasicSkill(new Longsword(new Equipment())));
                return weapon3;
            case "131":
                IEquipment weapon4 = new WeaponMasterSkill(new Longsword(new Equipment()));
                return weapon4;
            case "132":
                IEquipment weapon5 = new BlessedWeapon(new WeaponMasterSkill(new Longsword(new Equipment())));
                return weapon5;
            case "211":
                IEquipment weapon6 = new Knightsword(new Equipment());
                return weapon6;
            case "212":
                IEquipment weapon7 = new BlessedWeapon(new Knightsword(new Equipment()));
                return weapon7;
            case "221":
                IEquipment weapon8 = new WeaponBasicSkill(new Knightsword(new Equipment()));
                return weapon8;
            case "222":
                IEquipment weapon9 = new BlessedWeapon(new WeaponBasicSkill(new Knightsword(new Equipment())));
                return weapon9;
            case "231":
                IEquipment weapon10 = new WeaponMasterSkill(new Knightsword(new Equipment()));
                return weapon10;
            case "232":
                IEquipment weapon11 = new BlessedWeapon(new WeaponMasterSkill(new Knightsword(new Equipment())));
                return weapon11;
            default:
                return null;
        }
    }
}
