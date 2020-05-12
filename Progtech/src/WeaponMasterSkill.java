public class WeaponMasterSkill extends EquipmentDecorator {

    public WeaponMasterSkill(IEquipment ieqp) {
        super(ieqp);
    }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }

    private int DecorateWithAP() { return 35; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }

    private int DecorateWithIP() { return 15; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }

    private int DecorateWithDP() { return 30; }
}
