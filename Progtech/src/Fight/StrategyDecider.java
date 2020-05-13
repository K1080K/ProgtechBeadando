package Fight;

import java.util.ArrayList;
import Creatures.Creature;

public class StrategyDecider {
    private CombatStrategy cs;
    public void CombatStrategyChooser(CombatStrategy cs) {
        this.cs = cs;
    }

    public void Attack(Creature creature, int index, ArrayList<Creature> creatures) {
        this.cs.Attack(creature, index, creatures);
    }

    public void DefenceModifier(Creature creature) {
        this.cs.DefenceModifier(creature);
    }
}
