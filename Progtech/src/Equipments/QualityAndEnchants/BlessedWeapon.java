package Equipments.QualityAndEnchants;

import Equipments.EquipmentDecorator;
import Equipments.IEquipment;

public class BlessedWeapon extends EquipmentDecorator {

    public BlessedWeapon(IEquipment ieqp) {
        super(ieqp);
    }

    public String EquipmentName() {
        return DecorateWithLongsword() + super.EquipmentName();
    }

    private String DecorateWithLongsword() {
        return "Blessed ";
    }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }

    private int DecorateWithAP() { return 1; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }

    private int DecorateWithIP() { return 1; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }

    private int DecorateWithDP() { return 1; }
}
