public class WarriorLevel {

    DiceRolls roll = new DiceRolls();

    public int PainResistancePerLevel(int level) {
        int modifier = 0;
        for(int i = 0; i < level; i++){
            modifier += (roll.Rolld6() + 4);
        }
        return modifier;
    }

    public int InitiativePointsPerLevel(int level) {
        int modifier = 3 * level;
        return modifier;
    }

    public int AttackPointsPerLevel(int level) {
        int modifier = 4 * level;
        return modifier;
    }

    public int DefendPointsPerLevel(int level) {
        int modifier = 4 * level;
        return modifier;
    }
}
