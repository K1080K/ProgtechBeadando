package Equipments.Weapons;

import Equipments.EquipmentDecorator;
import Equipments.IEquipment;

public class Shortsword extends EquipmentDecorator {

    public Shortsword(IEquipment ieqp) {
        super(ieqp);
    }

    public String EquipmentName() {
        return super.EquipmentName() + DecorateWithShortsword();
    }
    private String DecorateWithShortsword() {
        return "Short sword";
    }

    public double Weight() {
        return super.Weight() + DecorateWithWeight();
    }
    private double DecorateWithWeight() {
        return 1;
    }

    public int Price() { return  super.Price() + DecorateWithPrice(); }
    private int DecorateWithPrice() { return 1000; }

    public int DamageIndex() {
        return super.DamageIndex() + DecorateWithDamage();
    }
    private int DecorateWithDamage() { return 3; }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }
    private int DecorateWithAP() { return -13; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }
    private int DecorateWithIP() { return -1; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }
    private int DecorateWithDP() { return -6; }
}
