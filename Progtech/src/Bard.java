import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;

public class Bard extends Character {

    DiceRolls roll = new DiceRolls();
    private BardLevel bl;

    public BardLevel getBl() {
        return bl;
    }

    public void setBl(BardLevel bl) { this.bl = bl; }

    //region This constructor is creating a bard from the required information


    public Bard(String name, boolean party_member, boolean alive, int age, Race race, Caste caste, int level) throws InvalidAgeException, InvalidAttributeException {
        super(name, party_member, alive, age, race, caste, level);
        this.bl = new BardLevel();
        this.getAttributes().setStrength(roll.Rolld10plus8() + getAttributes().getSumm().StrengthModifier(race, age));
        this.getAttributes().setDexterity(roll.Rolld10plus8() + getAttributes().getSumm().DexterityModifier(race, age));
        this.getAttributes().setQuickness(roll.Rolld10plus8() + getAttributes().getSumm().QuicknessModifier(race, age));
        this.getAttributes().setEndurance(roll.Roll2d6plus6() + getAttributes().getSumm().EnduranceModifier(race, age));
        this.getAttributes().setHealth(roll.Roll2d6plus6() + getAttributes().getSumm().HealthModifier(race, age));
        this.getAttributes().setWill(roll.Roll2d6plus6());
        this.getAttributes().setIntelligence(roll.Rolld10plus8x2() + getAttributes().getSumm().IntelligenceModifier(race, age));
        this.getHealth_andPainResistance().setHealth_points(5 + getHealth_andPainResistance().getHrm().HealthPointModifier(getAttributes().getHealth()));
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(6 +
                getHealth_andPainResistance().getHrm().ResistancePointModifier(getAttributes().getEndurance(), getAttributes().getWill()) +
                getBl().PainResistancePerLevel(getLevel()));
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(10 +
                getCombat_points().getCpm().InitiativePointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getBl().InitiativePointsPerLevel(getLevel()));
        this.getCombat_points().setActual_initiative_point(getCombat_points().getInitiative_Point());
        this.getCombat_points().setAttack_Point(20 +
                getCombat_points().getCpm().AttackPointModifiers(getAttributes().getStrength(), getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getBl().AttackPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_attack_point(getCombat_points().getAttack_Point());
        this.getCombat_points().setDefend_Point(75 +
                getCombat_points().getCpm().DefendPointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getBl().DefendPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_defend_point(getCombat_points().getDefend_Point());
        this.getCombat_points().setDamage(getCombat_points().getCpm().DamageModifier(getAttributes().getStrength()));
    }

    //endregion
}
