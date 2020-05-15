package Creatures.Castes;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;
import Rolls.DiceRolls;

public class Knight extends Character {

    DiceRolls roll = new DiceRolls();
    private KnightLevel kl;

    public KnightLevel getKl() {
        return kl;
    }

    public void setKl(KnightLevel wl) { this.kl = kl; }

    //region This constructor is creating a knight from the required information


    public Knight(String name, int age, Race race, Caste caste, int level) throws InvalidAgeException, InvalidAttributeException {
        super(name, age, race, caste, level);
        this.kl = new KnightLevel();
        this.setAlive(true);
        this.getAttributes().setStrength(roll.Rolld6plus12() + getAttributes().getSumm().StrengthModifier(race, age));
        this.getAttributes().setDexterity(roll.Roll3d6x2() + getAttributes().getSumm().DexterityModifier(race, age));
        this.getAttributes().setQuickness(roll.Roll3d6x2() + getAttributes().getSumm().QuicknessModifier(race, age));
        this.getAttributes().setEndurance(roll.Rolld10plus8() + getAttributes().getSumm().EnduranceModifier(race, age));
        this.getAttributes().setHealth(roll.Rolld10plus10() + getAttributes().getSumm().HealthModifier(race, age));
        this.getAttributes().setWill(roll.Rolld10plus8());
        this.getAttributes().setIntelligence(roll.Roll2d6plus6() + getAttributes().getSumm().IntelligenceModifier(race, age));
        this.getHealth_andPainResistance().setHealth_points(7 + getHealth_andPainResistance().getHrm().HealthPointModifier(getAttributes().getHealth()));
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(6 +
                getHealth_andPainResistance().getHrm().ResistancePointModifier(getAttributes().getEndurance(), getAttributes().getWill()) +
                getKl().PainResistancePerLevel(getLevel()));
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(5 +
                getCombat_points().getCpm().InitiativePointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getKl().InitiativePointsPerLevel(getLevel()));
        this.getCombat_points().setActual_initiative_point(getCombat_points().getInitiative_Point());
        this.getCombat_points().setAttack_Point(20 +
                getCombat_points().getCpm().AttackPointModifiers(getAttributes().getStrength(), getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getKl().AttackPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_attack_point(getCombat_points().getAttack_Point());
        this.getCombat_points().setDefend_Point(75 +
                getCombat_points().getCpm().DefendPointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getKl().DefendPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_defend_point(getCombat_points().getDefend_Point());
        this.getCombat_points().setDamage(getCombat_points().getCpm().DamageModifier(getAttributes().getStrength()));
        this.getCombat_points().setExperience_point(0);
        this.setGold(1000);
    }

    //endregion
}
