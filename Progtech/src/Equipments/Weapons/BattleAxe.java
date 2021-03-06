package Equipments.Weapons;

import Equipments.EquipmentDecorator;
import Equipments.IEquipment;

public class BattleAxe extends EquipmentDecorator {

    public BattleAxe(IEquipment ieqp) {
        super(ieqp);
    }

    public String EquipmentName() {
        return super.EquipmentName() + DecorateWithBattleAxe();
    }
    private String DecorateWithBattleAxe() {
        return "Battle axe";
    }

    public double Weight() {
        return super.Weight() + DecorateWithWeight();
    }
    private double DecorateWithWeight() {
        return 2;
    }

    public int Price() { return  super.Price() + DecorateWithPrice(); }
    private int DecorateWithPrice() { return 600; }

    public int DamageIndex() {
        return super.DamageIndex() + DecorateWithDamage();
    }
    private int DecorateWithDamage() { return 1; }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }
    private int DecorateWithAP() { return -13; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }
    private int DecorateWithIP() { return -5; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }
    private int DecorateWithDP() { return -9; }
}
