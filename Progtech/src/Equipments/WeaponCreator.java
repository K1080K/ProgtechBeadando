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
            case "311":
                IEquipment weapon12 = new BattleAxe(new Equipment());
                return weapon12;
            case "312":
                IEquipment weapon13 = new BlessedWeapon(new BattleAxe(new Equipment()));
                return weapon13;
            case "321":
                IEquipment weapon14 = new WeaponBasicSkill(new BattleAxe(new Equipment()));
                return weapon14;
            case "322":
                IEquipment weapon15 = new BlessedWeapon(new WeaponBasicSkill(new BattleAxe(new Equipment())));
                return weapon15;
            case "331":
                IEquipment weapon16 = new WeaponMasterSkill(new BattleAxe(new Equipment()));
                return weapon16;
            case "332":
                IEquipment weapon17 = new BlessedWeapon(new WeaponMasterSkill(new BattleAxe(new Equipment())));
                return weapon17;
            case "411":
                IEquipment weapon18 = new Shortsword(new Equipment());
                return weapon18;
            case "412":
                IEquipment weapon19 = new BlessedWeapon(new Shortsword(new Equipment()));
                return weapon19;
            case "421":
                IEquipment weapon20 = new WeaponBasicSkill(new Shortsword(new Equipment()));
                return weapon20;
            case "422":
                IEquipment weapon21 = new BlessedWeapon(new WeaponBasicSkill(new Shortsword(new Equipment())));
                return weapon21;
            case "431":
                IEquipment weapon22 = new WeaponMasterSkill(new Shortsword(new Equipment()));
                return weapon22;
            case "432":
                IEquipment weapon23 = new BlessedWeapon(new WeaponMasterSkill(new Shortsword(new Equipment())));
                return weapon23;
            case "511":
                IEquipment weapon24 = new Sabre(new Equipment());
                return weapon24;
            case "512":
                IEquipment weapon25 = new BlessedWeapon(new Sabre(new Equipment()));
                return weapon25;
            case "521":
                IEquipment weapon26 = new WeaponBasicSkill(new Sabre(new Equipment()));
                return weapon26;
            case "522":
                IEquipment weapon27 = new BlessedWeapon(new WeaponBasicSkill(new Sabre(new Equipment())));
                return weapon27;
            case "531":
                IEquipment weapon28 = new WeaponMasterSkill(new Sabre(new Equipment()));
                return weapon28;
            case "532":
                IEquipment weapon29 = new BlessedWeapon(new WeaponMasterSkill(new Sabre(new Equipment())));
                return weapon29;
            case "611":
                IEquipment weapon30 = new HeadHuntersword(new Equipment());
                return weapon30;
            case "612":
                IEquipment weapon31 = new BlessedWeapon(new HeadHuntersword(new Equipment()));
                return weapon31;
            case "621":
                IEquipment weapon32 = new WeaponBasicSkill(new HeadHuntersword(new Equipment()));
                return weapon32;
            case "622":
                IEquipment weapon33 = new BlessedWeapon(new WeaponBasicSkill(new HeadHuntersword(new Equipment())));
                return weapon33;
            case "631":
                IEquipment weapon34 = new WeaponMasterSkill(new HeadHuntersword(new Equipment()));
                return weapon34;
            case "632":
                IEquipment weapon35 = new BlessedWeapon(new WeaponMasterSkill(new HeadHuntersword(new Equipment())));
                return weapon35;
            case "711":
                IEquipment weapon36 = new Slansword(new Equipment());
                return weapon36;
            case "712":
                IEquipment weapon37 = new BlessedWeapon(new Slansword(new Equipment()));
                return weapon37;
            case "721":
                IEquipment weapon38 = new WeaponBasicSkill(new Slansword(new Equipment()));
                return weapon38;
            case "722":
                IEquipment weapon39 = new BlessedWeapon(new WeaponBasicSkill(new Slansword(new Equipment())));
                return weapon39;
            case "731":
                IEquipment weapon40 = new WeaponMasterSkill(new Slansword(new Equipment()));
                return weapon40;
            case "732":
                IEquipment weapon41 = new BlessedWeapon(new WeaponMasterSkill(new Slansword(new Equipment())));
                return weapon41;
            case "811":
                IEquipment weapon42 = new PickAxe(new Equipment());
                return weapon42;
            case "812":
                IEquipment weapon43 = new BlessedWeapon(new PickAxe(new Equipment()));
                return weapon43;
            case "821":
                IEquipment weapon44 = new WeaponBasicSkill(new PickAxe(new Equipment()));
                return weapon44;
            case "822":
                IEquipment weapon45 = new BlessedWeapon(new WeaponBasicSkill(new PickAxe(new Equipment())));
                return weapon45;
            case "831":
                IEquipment weapon46 = new WeaponMasterSkill(new PickAxe(new Equipment()));
                return weapon46;
            case "832":
                IEquipment weapon47 = new BlessedWeapon(new WeaponMasterSkill(new PickAxe(new Equipment())));
                return weapon47;
            case "911":
                IEquipment weapon48 = new Flail(new Equipment());
                return weapon48;
            case "912":
                IEquipment weapon49 = new BlessedWeapon(new Flail(new Equipment()));
                return weapon49;
            case "921":
                IEquipment weapon50 = new WeaponBasicSkill(new Flail(new Equipment()));
                return weapon50;
            case "922":
                IEquipment weapon51 = new BlessedWeapon(new WeaponBasicSkill(new Flail(new Equipment())));
                return weapon51;
            case "931":
                IEquipment weapon52 = new WeaponMasterSkill(new Flail(new Equipment()));
                return weapon52;
            case "932":
                IEquipment weapon53 = new BlessedWeapon(new WeaponMasterSkill(new Flail(new Equipment())));
                return weapon53;
            default:
                return null;
        }
    }
}
