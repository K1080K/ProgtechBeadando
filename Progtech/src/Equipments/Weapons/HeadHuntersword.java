package Equipments.Weapons;

import Equipments.EquipmentDecorator;
import Equipments.IEquipment;

public class HeadHuntersword extends EquipmentDecorator {

    public HeadHuntersword(IEquipment ieqp) {
        super(ieqp);
    }

    public String EquipmentName() {
        return super.EquipmentName() + DecorateWithHeadHuntersword();
    }
    private String DecorateWithHeadHuntersword() {
        return "Headhunter sword";
    }

    public double Weight() {
        return super.Weight() + DecorateWithWeight();
    }
    private double DecorateWithWeight() {
        return 0.8;
    }

    public int Price() { return  super.Price() + DecorateWithPrice(); }
    private int DecorateWithPrice() { return 2000; }

    public int DamageIndex() {
        return super.DamageIndex() + DecorateWithDamage();
    }
    private int DecorateWithDamage() { return 4; }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }
    private int DecorateWithAP() { return -9; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }
    private int DecorateWithIP() { return -2; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }
    private int DecorateWithDP() { return -4; }
}
