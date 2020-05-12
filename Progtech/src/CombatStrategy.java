import java.util.ArrayList;

public abstract class CombatStrategy {

    public abstract void Attack(Creature creature, int index, ArrayList<Creature> creatures);

    public abstract void DefenceModifier(Creature creature);
}
