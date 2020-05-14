package Creatures.Castes;

import Attributes.Attributes;
import Exceptions.InvalidAgeException;
import Creatures.Creature;
import Rolls.DiceRolls;

public abstract class Character extends Creature {

    DiceRolls roll = new DiceRolls();

    //region Fields

    private int age;
    private Race race;
    private Caste caste;
    private int level;
    private Attributes attributes;

    //endregion

    //region Properties

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if(12 <= age) this.age = age;
        else throw new InvalidAgeException(age);
    }

    public Race getRace() {
        return race;
    }

    public Caste getCaste() {
        return caste;
    }

    public int getLevel() { return level; }

    public void setLevel(int level) { this.level = level; }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }


    //endregion

    //region Constructor

    public Character(String name, boolean party_member, boolean alive, int age, Race race, Caste caste, int level) throws InvalidAgeException {
        super(name, party_member, alive);
        setAge(age);
        this.race = race;
        this.caste = caste;
        this.level = level;
        this.attributes = new Attributes(0,0,0,0,0,0,0);
    }

    //endregion

    public int Damage(int index) {
        switch (index) {
            case 1:
                int damage1 = roll.Rolld10() + getCombat_points().getDamage();
                return damage1;
            case 2:
                int damage2 = roll.Rolld6() + roll.Rolld6() + 2 + getCombat_points().getDamage();
                return damage2;
            case 3:
                int damage3 = roll.Rolld6() + 1 + getCombat_points().getDamage();
                return damage3;
            case 4:
                int damage4 = roll.Rolld6() + 2 + getCombat_points().getDamage();
                return damage4;
            case 5:
                int damage5 = roll.Rolld6() + 3 + getCombat_points().getDamage();
                return damage5;
            case 6:
                int damage6 = roll.Rolld10() + 2 + getCombat_points().getDamage();
                return damage6;
            default:
                return 0;
        }
    }
}
