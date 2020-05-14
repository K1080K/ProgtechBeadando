package Creatures.Enemies;

import Rolls.DiceRolls;

public class Wolf extends Bestiary {

    DiceRolls roll = new DiceRolls();

    public Wolf(String name, boolean party_member, boolean alive) {
        super(name, party_member, alive);
        this.getHealth_andPainResistance().setHealth_points(18);
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(38);
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(10);
        this.getCombat_points().setEquip_initiative_point(10);
        this.getCombat_points().setActual_initiative_point(getCombat_points().getInitiative_Point());
        this.getCombat_points().setAttack_Point(35);
        this.getCombat_points().setEquip_attack_point(35);
        this.getCombat_points().setActual_attack_point(getCombat_points().getAttack_Point());
        this.getCombat_points().setDefend_Point(60);
        this.getCombat_points().setEquip_defend_point(60);
        this.getCombat_points().setActual_defend_point(getCombat_points().getDefend_Point());
        this.getCombat_points().setExperience_point(5);
    }

    public int Damage(int index) {
        int damage = roll.Rolld6();
        return damage;
    }
}
