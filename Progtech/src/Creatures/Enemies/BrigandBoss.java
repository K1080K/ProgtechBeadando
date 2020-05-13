package Creatures.Enemies;

import Rolls.DiceRolls;

public class BrigandBoss extends Bestiary {

    DiceRolls roll = new DiceRolls();

    public BrigandBoss(String name, int gold, boolean party_member, boolean alive) {
        super(name, gold, party_member, alive);
        this.getHealth_andPainResistance().setHealth_points(11);
        this.getHealth_andPainResistance().setActual_health_points(getHealth_andPainResistance().getHealth_points());
        this.getHealth_andPainResistance().setPain_resistance_points(23);
        this.getHealth_andPainResistance().setActual_pain_resistance_points(getHealth_andPainResistance().getPain_resistance_points());
        this.getCombat_points().setInitiative_Point(14);
        this.getCombat_points().setEquip_initiative_point(21);
        this.getCombat_points().setActual_initiative_point(getCombat_points().getEquip_initiative_point());
        this.getCombat_points().setAttack_Point(42);
        this.getCombat_points().setEquip_attack_point(56);
        this.getCombat_points().setActual_attack_point(getCombat_points().getEquip_attack_point());
        this.getCombat_points().setDefend_Point(87);
        this.getCombat_points().setEquip_defend_point(103);
        this.getCombat_points().setActual_defend_point(getCombat_points().getEquip_defend_point());
        this.getCombat_points().setExperience_point(23);
        this.getCombat_points().setAbsorption(2);
    }

    @Override
    public int Damage(int index) {
        return roll.Rolld10();
    }
}
