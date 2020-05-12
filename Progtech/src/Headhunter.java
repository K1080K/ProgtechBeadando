import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;

public class Headhunter extends Character {

    DiceRolls roll = new DiceRolls();
    private HeadhunterLevel hl;

    public HeadhunterLevel getHl() {
        return hl;
    }

    public void setHl(HeadhunterLevel wl) { this.hl = hl; }

    //region This constructor is creating a headhunter from the required information


    public Headhunter(String name, boolean party_member, boolean alive, int age, Race race, Caste caste, int level) throws InvalidAgeException, InvalidAttributeException {
        super(name, party_member, alive, age, race, caste, level);
        this.hl = new HeadhunterLevel();
        this.getAttributes().setStrength(roll.Roll2d6plus6() + getAttributes().getSumm().StrengthModifier(race, age));
        this.getAttributes().setDexterity(roll.Rolld10plus8() + getAttributes().getSumm().DexterityModifier(race, age));
        this.getAttributes().setQuickness(roll.Rolld6plus12() + getAttributes().getSumm().QuicknessModifier(race, age));
        this.getAttributes().setEndurance(roll.Rolld6plus12() + getAttributes().getSumm().EnduranceModifier(race, age));
        this.getAttributes().setHealth(roll.Rolld10plus10() + getAttributes().getSumm().HealthModifier(race, age));
        this.getAttributes().setWill(roll.Rolld10plus8());
        this.getAttributes().setIntelligence(roll.Roll3d6x2() + getAttributes().getSumm().IntelligenceModifier(race, age));
        this.getHealth_andPainResistance().setHealth_points(6 + getHealth_andPainResistance().getHrm().HealthPointModifier(getAttributes().getHealth()));
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(7 +
                getHealth_andPainResistance().getHrm().ResistancePointModifier(getAttributes().getEndurance(), getAttributes().getWill()) +
                getHl().PainResistancePerLevel(getLevel()));
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(10 +
                getCombat_points().getCpm().InitiativePointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getHl().InitiativePointsPerLevel(getLevel()));
        this.getCombat_points().setActual_initiative_point(getCombat_points().getInitiative_Point());
        this.getCombat_points().setAttack_Point(20 +
                getCombat_points().getCpm().AttackPointModifiers(getAttributes().getStrength(), getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getHl().AttackPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_attack_point(getCombat_points().getAttack_Point());
        this.getCombat_points().setDefend_Point(75 +
                getCombat_points().getCpm().DefendPointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getHl().DefendPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_defend_point(getCombat_points().getDefend_Point());
        this.getCombat_points().setDamage(getCombat_points().getCpm().DamageModifier(getAttributes().getStrength()));
    }

    //endregion
}
