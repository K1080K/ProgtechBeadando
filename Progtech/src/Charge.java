import java.util.ArrayList;

public class Charge extends CombatStrategy {

    DiceRolls roll = new DiceRolls();

    @Override
    public void Attack(Creature creature, int index, ArrayList<Creature> creatures) {
        int ap = creature.getCombat_points().getEquip_attack_point() + roll.Rolld100() + 20;
        System.out.println(creature.getName() + " rolled: " + ap);
        if((creatures.get(index).getCombat_points().getEquip_defend_point() + 50) <= ap) {
            int hpdmg = creature.Damage(creature.getCombat_points().getWeapon_index()) * 2;
            int rpdmg = hpdmg * 2;
            creatures.get(index).DecreaseAHP(hpdmg);
            creatures.get(index).DecreaseAPRP(rpdmg);
            System.out.println(creature.getName() + " did " + hpdmg + " health points and " + rpdmg + " pain resistance points damage on " + creatures.get(index).getName() + ". " +
                    creatures.get(index).getHealth_andPainResistance().getActual_health_points() + " hp and " +
                    creatures.get(index).getHealth_andPainResistance().getActual_pain_resistance_points() + " rp remains.");
            IsAlive(index, creatures);
        }
        else if(creatures.get(index).getCombat_points().getEquip_defend_point() <= ap) {
            int rpdmg = creature.Damage(creature.getCombat_points().getWeapon_index()) * 2;
            creatures.get(index).DecreaseAPRP(rpdmg);
            System.out.println(creature.getName() + " did " + rpdmg + " pain resistance points damage on " + creatures.get(index).getName() + ". " +
                    creatures.get(index).getHealth_andPainResistance().getActual_pain_resistance_points() + " rp remains.");
            IsAlive(index, creatures);
        }
        else {
            System.out.println(creature.getName() + " couldn't hit " + creatures.get(index).getName() + ".");
        }
    }

    @Override
    public void DefenceModifier(Creature creature) {
        int newDefence = creature.getCombat_points().getEquip_defend_point() - 25;
        creature.getCombat_points().setActual_defend_point(newDefence);
    }

    public void IsAlive(int index, ArrayList<Creature> creatures) {
        if(creatures.get(index).getHealth_andPainResistance().getActual_health_points() < 0 || creatures.get(index).getHealth_andPainResistance().getActual_pain_resistance_points() < 0) {
            System.out.println(creatures.get(index).getName() + " is defeated!");
            creatures.get(index).setAlive(false);
            creatures.get(index).InitiativeInARound(0);
        }
    }
}
