package CombatAndHealth;

public class CombatPoints {

    //region Fields

    private int initiative_point;
    private int equip_initiative_point;
    private int actual_initiative_point;
    private int attack_point;
    private int equip_attack_point;
    private int actual_attack_point;
    private int defend_point;
    private int equip_defend_point;
    private int actual_defend_point;
    private int damage;
    private int absorption;
    private int weapon_index;
    private int experience_point;
    private CombatPointModifiers cpm;

    //endregion

    //region Properties

    public int getInitiative_Point() { return initiative_point; }
    public void setInitiative_Point(int initiative_point) { this.initiative_point = initiative_point; }

    public int getEquip_initiative_point() { return equip_initiative_point; }
    public void setEquip_initiative_point(int equip_initiative_point) { this.equip_initiative_point = equip_initiative_point; }

    public int getActual_initiative_point() { return actual_initiative_point; }
    public void setActual_initiative_point(int actual_initiative_point) { this.actual_initiative_point = actual_initiative_point; }

    public int getAttack_Point() { return attack_point; }
    public void setAttack_Point(int attack_point) { this.attack_point = attack_point; }

    public int getEquip_attack_point() { return equip_attack_point; }
    public void setEquip_attack_point(int equip_attack_point) { this.equip_attack_point = equip_attack_point; }

    public int getActual_attack_point() { return actual_attack_point; }
    public void setActual_attack_point(int actual_attack_point) { this.actual_attack_point = actual_attack_point; }

    public int getDefend_Point() { return defend_point; }
    public void setDefend_Point(int defend_point) { this.defend_point = defend_point; }

    public int getEquip_defend_point() { return equip_defend_point; }
    public void setEquip_defend_point(int equip_defend_point) { this.equip_defend_point = equip_defend_point; }

    public int getActual_defend_point() { return actual_defend_point; }
    public void setActual_defend_point(int actual_defend_point) { this.actual_defend_point = actual_defend_point; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getAbsorption() { return absorption; }
    public void setAbsorption(int absorption) { this.absorption = absorption; }

    public int getWeapon_index() { return weapon_index; }
    public void setWeapon_index(int weapon_index) { this.weapon_index = weapon_index; }

    public int getExperience_point() { return experience_point; }
    public void setExperience_point(int experience_point) { this.experience_point = experience_point; }

    public CombatPointModifiers getCpm() { return cpm; }
    public void setCpm(CombatPointModifiers cpm) { this.cpm = cpm; }

    //endregion

    //region Constructor

    public CombatPoints(int initiative_point, int attack_point, int defend_point){
        this.initiative_point = initiative_point;
        this.attack_point = attack_point;
        this.defend_point = defend_point;
        this.cpm = new CombatPointModifiers();
    }

    //endregion


}
