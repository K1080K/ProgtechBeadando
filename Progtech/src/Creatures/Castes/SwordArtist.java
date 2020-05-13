package Creatures.Castes;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;
import Rolls.DiceRolls;

public class SwordArtist extends Character {

    DiceRolls roll = new DiceRolls();
    private SwordArtistLevel sl;

    public SwordArtistLevel getSl() {
        return sl;
    }

    public void setSl(SwordArtistLevel sl) { this.sl = sl; }

    //region This constructor is creating a sword artist from the required information


    public SwordArtist(String name, int gold, boolean party_member, boolean alive, int age, Race race, Caste caste, int level) throws InvalidAgeException, InvalidAttributeException {
        super(name, gold, party_member, alive, age, race, caste, level);
        this.sl = new SwordArtistLevel();
        this.getAttributes().setStrength(roll.Rolld10plus8() + getAttributes().getSumm().StrengthModifier(race, age));
        this.getAttributes().setDexterity(roll.Rolld6plus12() + 2 + getAttributes().getSumm().DexterityModifier(race, age));
        this.getAttributes().setQuickness(roll.Rolld6plus12() + getAttributes().getSumm().QuicknessModifier(race, age));
        this.getAttributes().setEndurance(roll.Rolld10plus8() + getAttributes().getSumm().EnduranceModifier(race, age));
        this.getAttributes().setHealth(roll.Rolld10plus8() + getAttributes().getSumm().HealthModifier(race, age));
        this.getAttributes().setWill(roll.Rolld6plus12());
        this.getAttributes().setIntelligence(roll.Roll2d6plus6() + getAttributes().getSumm().IntelligenceModifier(race, age));
        this.getHealth_andPainResistance().setHealth_points(4 + getHealth_andPainResistance().getHrm().HealthPointModifier(getAttributes().getHealth()));
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(8 +
                getHealth_andPainResistance().getHrm().ResistancePointModifier(getAttributes().getEndurance(), getAttributes().getWill()) +
                getSl().PainResistancePerLevel(getLevel()));
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(10 +
                getCombat_points().getCpm().InitiativePointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getSl().InitiativePointsPerLevel(getLevel()));
        this.getCombat_points().setActual_initiative_point(getCombat_points().getInitiative_Point());
        this.getCombat_points().setAttack_Point(20 +
                getCombat_points().getCpm().AttackPointModifiers(getAttributes().getStrength(), getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getSl().AttackPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_attack_point(getCombat_points().getAttack_Point());
        this.getCombat_points().setDefend_Point(75 +
                getCombat_points().getCpm().DefendPointModifiers(getAttributes().getDexterity(), getAttributes().getQuickness()) +
                getSl().DefendPointsPerLevel(getLevel()));
        this.getCombat_points().setActual_defend_point(getCombat_points().getDefend_Point());
        this.getCombat_points().setDamage(getCombat_points().getCpm().DamageModifier(getAttributes().getStrength()));
        this.getCombat_points().setExperience_point(0);
        this.setGold(1000);
    }

    //endregion
}
