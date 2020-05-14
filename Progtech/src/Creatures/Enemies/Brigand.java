package Creatures.Enemies;

import Rolls.DiceRolls;

public class Brigand extends Bestiary {

    DiceRolls roll = new DiceRolls();

    public Brigand(String name, boolean party_member, boolean alive) {
        super(name, party_member, alive);
        this.getHealth_andPainResistance().setHealth_points(6);
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(9);
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(8);
        this.getCombat_points().setEquip_initiative_point(17);
        this.getCombat_points().setActual_initiative_point(getCombat_points().getEquip_initiative_point());
        this.getCombat_points().setAttack_Point(19);
        this.getCombat_points().setEquip_attack_point(31);
        this.getCombat_points().setActual_attack_point(getCombat_points().getEquip_attack_point());
        this.getCombat_points().setDefend_Point(68);
        this.getCombat_points().setEquip_defend_point(82);
        this.getCombat_points().setActual_defend_point(getCombat_points().getEquip_defend_point());
        this.getCombat_points().setExperience_point(8);
        this.getCombat_points().setAbsorption(1);
    }

    @Override
    public int Damage(int index) {
        return roll.Rolld6() + 1;
    }
}
