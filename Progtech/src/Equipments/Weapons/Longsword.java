package Equipments.Weapons;

import Equipments.EquipmentDecorator;
import Equipments.IEquipment;
import Rolls.DiceRolls;

public class Longsword extends EquipmentDecorator {

    DiceRolls roll = new DiceRolls();

    public Longsword(IEquipment ieqp) {
        super(ieqp);
    }

    public String EquipmentName() {
        return super.EquipmentName() + DecorateWithLongsword();
    }

    private String DecorateWithLongsword() {
        return "Longsword";
    }

    public double Weight() {
        return super.Weight() + DecorateWithWeight();
    }

    private double DecorateWithWeight() {
        return 1.5;
    }

    public int DamageIndex() {
        return super.DamageIndex() + DecorateWithDamage();
    }

    private int DecorateWithDamage() { return 1; }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }

    private int DecorateWithAP() { return -11; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }

    private int DecorateWithIP() { return -4; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }

    private int DecorateWithDP() { return -4; }
}
