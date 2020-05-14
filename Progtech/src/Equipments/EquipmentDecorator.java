package Equipments;

public abstract class EquipmentDecorator implements IEquipment {

    private IEquipment ieqp;

    public EquipmentDecorator(IEquipment ieqp) {
        this.ieqp = ieqp;
    }

    @Override
    public String EquipmentName() {
        return ieqp.EquipmentName();
    }

    @Override
    public double Weight() {
        return ieqp.Weight();
    }

    @Override
    public int Price() { return ieqp.Price(); }

    @Override
    public int DamageIndex() {
        return ieqp.DamageIndex();
    }

    @Override
    public int ModifyOnAP() { return ieqp.ModifyOnAP(); }

    @Override
    public int ModifyOnIP() { return ieqp.ModifyOnIP(); }

    @Override
    public int ModifyOnDP() { return ieqp.ModifyOnDP(); }
}
