public class InfoPanel implements IInfoPanel {

    @Override
    public String Info(Creature creature) {
        return "Name:\t\t\t\t\t\t" + creature.getName() +
                "\nInitiative points:\t\t\t" + creature.getCombat_points().getInitiative_Point() +
                "\nAttack points:\t\t\t\t" + creature.getCombat_points().getAttack_Point() +
                "\nDefend points:\t\t\t\t" + creature.getCombat_points().getDefend_Point() +
                "\nDamageIndex:\t\t\t\t\t\t" + creature.getCombat_points().getDamage() +
                "\nHealth points:\t\t\t\t" + creature.getHealth_andPainResistance().getActual_health_points() +
                "\nPain resistance points:\t\t" + creature.getHealth_andPainResistance().getActual_pain_resistance_points() + "\n";
    }

    @Override
    public String CharacterInfo(Character character) {
        return "Name:\t\t\t\t\t\t" + character.getName() +
                "\nAge:\t\t\t\t\t\t" + character.getAge() +
                "\nRace:\t\t\t\t\t\t" + character.getRace() +
                "\nCaste:\t\t\t\t\t\t" + character.getCaste() +
                "\nLevel:\t\t\t\t\t\t" + character.getLevel() +
                "\nStrength:\t\t\t\t\t" + character.getAttributes().getStrength() +
                "\nDexterity:\t\t\t\t\t" + character.getAttributes().getDexterity() +
                "\nQuickness:\t\t\t\t\t" + character.getAttributes().getQuickness() +
                "\nEndurance:\t\t\t\t\t" + character.getAttributes().getEndurance() +
                "\nHealth:\t\t\t\t\t\t" + character.getAttributes().getHealth() +
                "\nWill:\t\t\t\t\t\t" + character.getAttributes().getWill() +
                "\nIntelligence:\t\t\t\t" + character.getAttributes().getIntelligence() +
                "\nInitiative points:\t\t\t" + character.getCombat_points().getInitiative_Point() +
                "\nAttack points:\t\t\t\t" + character.getCombat_points().getAttack_Point() +
                "\nDefend points:\t\t\t\t" + character.getCombat_points().getDefend_Point() +
                "\nDamageIndex:\t\t\t\t\t\t" + character.getCombat_points().getDamage() +
                "\nHealth points:\t\t\t\t" + character.getHealth_andPainResistance().getActual_health_points() +
                "\nPain resistance points:\t\t" + character.getHealth_andPainResistance().getActual_pain_resistance_points() + "\n";
    }
}
