public class Knightsword extends EquipmentDecorator {

    DiceRolls roll = new DiceRolls();

    public Knightsword(IEquipment ieqp) {
        super(ieqp);
    }

    public String EquipmentName() {
        return super.EquipmentName() + DecorateWithLongsword();
    }

    private String DecorateWithLongsword() {
        return "Knight sword";
    }

    public double Weight() {
        return super.Weight() + DecorateWithWeight();
    }

    private double DecorateWithWeight() {
        return 3.5;
    }

    public int DamageIndex() {
        return super.DamageIndex() + DecorateWithDamage();
    }

    private int DecorateWithDamage() { return 2; }

    public int ModifyOnAP() { return super.ModifyOnAP() + DecorateWithAP(); }

    private int DecorateWithAP() { return -15; }

    public int ModifyOnIP() { return super.ModifyOnIP() + DecorateWithIP(); }

    private int DecorateWithIP() { return -8; }

    public int ModifyOnDP() { return super.ModifyOnDP() + DecorateWithDP(); }

    private int DecorateWithDP() { return -13; }
}
