package Creatures.Enemies;

import Rolls.DiceRolls;

public class BrigandElite extends Bestiary {

    DiceRolls roll = new DiceRolls();

    public BrigandElite(String name) {
        super(name);
        this.setAlive(true);
        this.setPartyMember(false);
        this.getHealth_andPainResistance().setHealth_points(7);
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(10);
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(12);
        this.getCombat_points().setEquip_initiative_point(18);
        this.getCombat_points().setActual_initiative_point(getCombat_points().getEquip_initiative_point());
        this.getCombat_points().setAttack_Point(23);
        this.getCombat_points().setEquip_attack_point(37);
        this.getCombat_points().setActual_attack_point(getCombat_points().getEquip_attack_point());
        this.getCombat_points().setDefend_Point(76);
        this.getCombat_points().setEquip_defend_point(92);
        this.getCombat_points().setActual_defend_point(getCombat_points().getEquip_defend_point());
        this.getCombat_points().setExperience_point(11);
        this.getCombat_points().setAbsorption(1);
    }

    @Override
    public int Damage(int index) {
        return roll.Rolld10();
    }
}
