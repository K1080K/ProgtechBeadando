package Equipments.SkillModifiers;

import Equipments.EquipmentDecorator;
import Equipments.IEquipment;

public class WeaponBasicSkill extends EquipmentDecorator {

    public WeaponBasicSkill(IEquipment ieqp) {
        super(ieqp);
    }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }

    private int DecorateWithAP() { return 25; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }

    private int DecorateWithIP() { return 10; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }

    private int DecorateWithDP() { return 20; }
}
