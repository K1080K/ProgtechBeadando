package Creatures.Castes;

import Rolls.DiceRolls;

public class SwordArtistLevel {

    DiceRolls roll = new DiceRolls();

    public int PainResistancePerLevel(int level) {
        int modifier = 0;
        for(int i = 1; i < level; i++){
            modifier += (roll.Rolld6() + 5);
        }
        return modifier;
    }

    public int InitiativePointsPerLevel(int level) {
        int modifier = 2 * level;
        return modifier;
    }

    public int AttackPointsPerLevel(int level) {
        int modifier = 3 * level;
        return modifier;
    }

    public int DefendPointsPerLevel(int level) {
        int modifier = 3 * level;
        return modifier;
    }
}
