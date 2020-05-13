package Attributes;

import Exceptions.InvalidAttributeException;

public class Attributes {

    //region Fields

    private int strength;
    private int dexterity;
    private int quickness;
    private int endurance;
    private int health;
    private int will;
    private int intelligence;

    private SummarizedAttributeModifiers summ;

    //endregion

    //region Properties

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) throws InvalidAttributeException {
        if(3 <= strength && strength <= 20) this.strength = strength;
        else if(strength < 3) this.strength = 3;
        else throw new InvalidAttributeException();
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) throws InvalidAttributeException {
        if(3 <= dexterity && dexterity <= 22) this.dexterity = dexterity;
        else if(dexterity < 3) this.dexterity = 3;
        else throw new InvalidAttributeException();
    }

    public int getQuickness() {
        return quickness;
    }

    public void setQuickness(int quickness) throws InvalidAttributeException {
        if(3 <= quickness && quickness <= 20) this.quickness = quickness;
        else if(quickness < 3) this.quickness = 3;
        else throw new InvalidAttributeException();
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) throws InvalidAttributeException {
        if(3 <= endurance && endurance <= 20) this.endurance = endurance;
        else if(endurance < 3) this.endurance = 3;
        else throw new InvalidAttributeException();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws InvalidAttributeException {
        if(3 <= health && health <= 22) this.health = health;
        else if(health < 3) this.health = 3;
        else throw new InvalidAttributeException();
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) throws InvalidAttributeException {
        if(3 <= will && will <= 20) this.will = will;
        else throw new InvalidAttributeException();
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) throws InvalidAttributeException {
        if(3 <= intelligence && intelligence <= 20) this.intelligence = intelligence;
        else if(intelligence < 3) this.intelligence = 3;
        else throw new InvalidAttributeException();
    }

    public SummarizedAttributeModifiers getSumm() { return  summ; }
    public void setSumm(SummarizedAttributeModifiers summ) { this.summ = summ; }

    //endregion

    //region Constructor

    public Attributes(int strength, int dexterity, int quickness, int endurance, int health, int will, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.quickness = quickness;
        this.endurance = endurance;
        this.health = health;
        this.will = will;
        this.intelligence = intelligence;
        this.summ = new SummarizedAttributeModifiers();
    }

    //endregion

}
