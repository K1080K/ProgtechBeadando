package Creatures.Castes;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;
import Rolls.DiceRolls;

public class Thief extends Character {

    DiceRolls roll = new DiceRolls();
    private ThiefLevel tl;

    public ThiefLevel getTl() {
        return tl;
    }

    public void setTl(ThiefLevel tl) { this.tl = tl; }

    //region This constructor is creating a thief from the required information


    public Thief(String name, int gold, boolean party_member, boolean alive, int age, Race race, Caste caste, int level) throws InvalidAgeException, InvalidAttributeException {
        super(name, gold, party_member, alive, age, race, caste, level);
        this.tl = new ThiefLevel();
        this.getAttributes().setStrength(roll.Roll3d6x2() + getAttributes().getSumm().StrengthModifier(race, age));
        this.getAttributes().setDexterity(roll.Rolld6plus12() + getAttributes().getSumm().DexterityModifier(race, age));
        this.getAttributes().setQuickness(roll.Rolld10plus8() + getAttributes().getSumm().QuicknessModifier(race, age));
        this.getAttributes().setEndurance(roll.Roll3d6x2() + getAttributes().getSumm().EnduranceModifier(race, age));
        this.getAttributes().setHealth(roll.Roll3d6x2() + getAttributes().getSumm().HealthModifier(race, age));
        this.getAttributes().setWill(roll.Roll3d6());
        this.getAttributes().setIntelligence(roll.Roll2d6plus6() + getAttributes().getSumm().IntelligenceModifier(race, age));
        this.getHealth_andPainResistance().setHealth_points(4 + getHealth_andPainResistance().getHrm().HealthPointModifier(getAttributes().getHealth()));
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(5 +
                getHealth_andPainResistance().getHrm().ResistancePointModifier(getAttributes().getEndurance(), getAttributes().getWill()) +
                getTl().PainResistancePerLevel(getLevel()));
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(8 +
                getCombat_points().getCpm().InitiativePointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getTl().InitiativePointsPerLevel(getLevel()));
        this.getCombat_points().setActual_initiative_point(getCombat_points().getInitiative_Point());
        this.getCombat_points().setAttack_Point(17 +
                getCombat_points().getCpm().AttackPointModifiers(getAttributes().getStrength(), getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getTl().AttackPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_attack_point(getCombat_points().getAttack_Point());
        this.getCombat_points().setDefend_Point(72 +
                getCombat_points().getCpm().DefendPointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getTl().DefendPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_defend_point(getCombat_points().getDefend_Point());
        this.getCombat_points().setDamage(getCombat_points().getCpm().DamageModifier(getAttributes().getStrength()));
        this.getCombat_points().setExperience_point(0);
        this.setGold(1000);
    }

    //endregion
}
