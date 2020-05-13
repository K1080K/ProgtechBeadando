package Creatures;

import CombatAndHealth.CombatPoints;
import CombatAndHealth.Health_andPainResistance;
import Fight.StrategyDecider;
import InfoFiles.InfoPanel;

public abstract class Creature implements Comparable {

    //region Fields

    private String name;
    private int gold;
    private boolean party_member;
    private boolean alive;
    private Health_andPainResistance health_andPainResistance;
    private CombatPoints combat_points;
    private InfoPanel info;
    private StrategyDecider decider;

    //endregion

    //region Properties

    public String getName() {
        return name;
    }

    public int getGold() { return gold; }
    public void setGold(int gold) { this.gold = gold; }

    public boolean getPartyMember() { return party_member; }
    public void setPartyMember(boolean party_member) { this.party_member = party_member; }

    public boolean getAlive() { return alive; }
    public void setAlive(boolean alive) { this.alive = alive; }

    public Health_andPainResistance getHealth_andPainResistance() { return  health_andPainResistance; }
    public void setHealth_andPainResistance(Health_andPainResistance health_andPainResistance) { this.health_andPainResistance = health_andPainResistance; }

    public CombatPoints getCombat_points() { return combat_points; }
    public void setCombat_points(CombatPoints combat_points) { this.combat_points = combat_points; }

    public InfoPanel getInfo() { return info; }
    public void setInfo(InfoPanel info) { this.info = info; }

   public StrategyDecider getDecider() { return decider; }
   public void setDecider(StrategyDecider decider) { this.decider = decider; }

    //endregion

    //region Constructor

    public Creature(String name, int gold, boolean party_member, boolean alive) {
        this.name = name;
        this.gold = gold;
        this.party_member = party_member;
        this.alive = alive;
        this.health_andPainResistance = new Health_andPainResistance(0,0,0,0);
        this.combat_points = new CombatPoints(0,0,0);
        this.info = new InfoPanel();
        this.decider = new StrategyDecider();
    }

    //endregion



    public abstract int Damage(int index);

    @Override
    public int compareTo(Object comparedto) {
        int compare_initiative =((Creature)comparedto).getCombat_points().getActual_initiative_point();
        /* For Ascending order*/
        return this.getCombat_points().getActual_initiative_point()-compare_initiative;
    }

    public void DecreaseAPRP(int damage) {
        int newPRP = getHealth_andPainResistance().getActual_pain_resistance_points() - damage;
        this.health_andPainResistance.setActual_pain_resistance_points(newPRP);
    }

    public void DecreaseAHP(int damage) {
        int newHP = getHealth_andPainResistance().getActual_health_points() - damage;
        this.health_andPainResistance.setActual_health_points(newHP);
    }

    public void InitiativeInARound(int initiative) {
        int newInitiative = initiative;
        this.combat_points.setActual_initiative_point(newInitiative);
    }

    public void DefenceInARound(int defence) {
        int newDefence = defence;
        this.combat_points.setActual_defend_point(newDefence);
    }

    public void InitiativeWithEquipment(int weapon_initiative) {
        int newInitiative = this.getCombat_points().getInitiative_Point() + weapon_initiative;
        this.combat_points.setEquip_initiative_point(newInitiative);
    }

    public void DefenceWithEquipment(int weapon_defence) {
        int newDefence = this.getCombat_points().getDefend_Point() + weapon_defence;
        this.combat_points.setEquip_defend_point(newDefence);
    }

    public void AttackWithEquipment(int weapon_attack) {
        int newAttack = this.getCombat_points().getAttack_Point() + weapon_attack;
        this.combat_points.setEquip_attack_point(newAttack);
    }
}
