package Fight;

import java.util.ArrayList;
import Creatures.Creature;

public class DefendingFight extends CombatStrategy {

    @Override
    public void Attack(Creature creature, int index, ArrayList<Creature> creatures) {
        System.out.println(creature.getName() + " is focusing on defending in this turn he is not attacking.");
    }

    @Override
    public void DefenceModifier(Creature creature) {
        int newDefence = creature.getCombat_points().getEquip_defend_point() + 40;
        creature.getCombat_points().setActual_defend_point(newDefence);
    }
}
