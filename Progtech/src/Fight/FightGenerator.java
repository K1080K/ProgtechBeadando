package Fight;

import Fight.Charge;
import Fight.DefendingFight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import Rolls.DiceRolls;
import Creatures.Creature;

public class FightGenerator {

    DiceRolls roll = new DiceRolls();
    StrategyDecider sd = new StrategyDecider();

    public int EnemiesNumber(ArrayList<Creature> creatures) {
        int enemynumber = 0;
        for(Creature c : creatures) {
            if(c.getPartyMember() == false) {
                enemynumber++;
            }
        }
        return enemynumber;
    }

    public int PartyMembersNumber(ArrayList<Creature> creatures) {
        int partymembernumber = 0;
        for(Creature c : creatures) {
            if(c.getPartyMember() == true) {
                partymembernumber++;
            }
        }
        return partymembernumber;
    }

    public void Combat(ArrayList<Creature> creatures) throws InterruptedException {
        int endvictory = EnemiesNumber(creatures);
        int endloose = PartyMembersNumber(creatures);
        while(endvictory != 0 && endloose != 0) {
            StrategyChooser(creatures);
            StartingOrder(creatures);
            SortingByActualInitiative(creatures);
            Round(creatures);
            IniCleaner(creatures);
            DefCleaner(creatures);
            endvictory -= End(creatures, endvictory, endloose);
            endloose -= End(creatures, endvictory, endloose);
        }
    }

    public void StrategyChooser(ArrayList<Creature> creatures) {
        for(Creature c : creatures) {
            if(c.getPartyMember() == true && c.getAlive() == true) {
                System.out.println(c.getName() + " please choose your strategy for the turn!\n1. Attack   2. Charge   3. Defending");
                Scanner sc = new Scanner(System.in);
                int a = tryParse(sc, 1, 3);
                StrategyGiver(a, c);
            }
        }
    }

    public void StrategyGiver(int a, Creature creature) {
        switch(a){
            case 1:
                System.out.println(creature.getName() + " choose a simple attack for this turn.");
                sd.CombatStrategyChooser(new SimpleAttack());
                sd.DefenceModifier(creature);
                break;
            case 2:
                System.out.println(creature.getName() + " choose to charge in this turn.");
                sd.CombatStrategyChooser(new Charge());
                sd.DefenceModifier(creature);
                break;
            case 3:
                System.out.println(creature.getName() + " is only focusing on avoid the attacks in this turn.");
                sd.CombatStrategyChooser(new DefendingFight());
                sd.DefenceModifier(creature);
        }
    }

    public ArrayList<Creature> StartingOrder(ArrayList<Creature> creatures) {
        for(Creature c : creatures) {
            if(c.getAlive() == false) { continue; }
            int newInitiative = c.getCombat_points().getEquip_initiative_point() + roll.Rolld10();
            System.out.println(c.getName() + " rolled " + newInitiative + ".");
            c.InitiativeInARound(newInitiative);
        }
        return creatures;
    }

    public ArrayList<Creature> SortingByActualInitiative(ArrayList<Creature> creatures) {
        Collections.sort(creatures, Collections.reverseOrder());
        return creatures;
    }

    public void Round(ArrayList<Creature> creatures) throws InterruptedException {
        for(Creature c : creatures) {
            if(c.getAlive() == false) { continue; }
            int index = TargetCaller(c, creatures);
            sd.Attack(c, index, creatures);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public int TargetCaller(Creature creature, ArrayList<Creature> creatures) {
        int target = roll.RollRandomTarget(creatures);
        if(creature.getPartyMember() == true) {
            while(creatures.get(target - 1).getPartyMember() != false || creatures.get(target - 1).getAlive() != true) {
                target = roll.RollRandomTarget(creatures);
            }
        }
        else {
            while(creatures.get(target - 1).getPartyMember() != true || creatures.get(target - 1).getAlive() != true) {
                target = roll.RollRandomTarget(creatures);
            }
        }
        System.out.println(creature.getName() + " is attacking " + creatures.get(target - 1).getName());
        return target - 1;
    }

    public void Attack(Creature creature, int index, ArrayList<Creature> creatures) {
        int ap = creature.getCombat_points().getAttack_Point() + roll.Rolld100();
        if((creatures.get(index).getCombat_points().getDefend_Point() + 50) <= ap) {
            int hpdmg = creature.getCombat_points().getDamage();
            int rpdmg = creature.getCombat_points().getDamage() * 2;
            creatures.get(index).DecreaseAHP(hpdmg);
            creatures.get(index).DecreaseAPRP(rpdmg);
            System.out.println(creature.getName() + " did " + hpdmg + " health points and " + rpdmg + " pain resistance points damage on " + creatures.get(index).getName() + ". " +
                    creatures.get(index).getHealth_andPainResistance().getActual_health_points() + " hp and " +
                    creatures.get(index).getHealth_andPainResistance().getActual_pain_resistance_points() + " rp remains.");
            IsAlive(index, creatures);
        }
        else if(creatures.get(index).getCombat_points().getDefend_Point() <= ap) {
            int rpdmg = creature.getCombat_points().getDamage();
            creatures.get(index).DecreaseAPRP(rpdmg);
            System.out.println(creature.getName() + " did " + rpdmg + " pain resistance points damage on " + creatures.get(index).getName() + ". " +
                    creatures.get(index).getHealth_andPainResistance().getActual_pain_resistance_points() + " rp remains.");
            IsAlive(index, creatures);
        }
        else {
            System.out.println(creature.getName() + " couldn't hit " + creatures.get(index).getName() + ".");
        }
    }

    public void IsAlive(int index, ArrayList<Creature> creatures) {
        if(creatures.get(index).getHealth_andPainResistance().getActual_health_points() < 0 || creatures.get(index).getHealth_andPainResistance().getActual_pain_resistance_points() < 0) {
            System.out.println(creatures.get(index).getName() + " is defeated!");
            creatures.get(index).setAlive(false);
            creatures.get(index).InitiativeInARound(0);
        }
    }

    public void IniCleaner(ArrayList<Creature> creatures) {
        for(Creature c : creatures) {
            if(c.getAlive() == false) { continue; }
            int ini = c.getCombat_points().getEquip_initiative_point();
            c.InitiativeInARound(ini);
        }
    }

    public void DefCleaner(ArrayList<Creature> creatures) {
        for(Creature c : creatures) {
            if(c.getAlive() == false) { continue; }
            int def = c.getCombat_points().getEquip_defend_point();
            c.DefenceInARound(def);
        }
    }

    public int End(ArrayList<Creature> creatures, int endvictory, int endloose) {
        int a = 0;
        int b = 0;
        for(Creature c : creatures) {
            if(c.getPartyMember() == false && c.getAlive() == false) {
                a++;
            }
            else if(c.getPartyMember() == true && c.getAlive() == false) {
                b++;
            }
        }
        if(a == endvictory) {
            System.out.println("The heroes won the fight!");
            return a;
        }
        else if(b == endloose) {
            System.out.println("The battle is lost you died guys. :(");
            return b;
        }
        return 0;
    }

    public boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int tryParse(Scanner sc, int min, int max){
        String s;
        int retVal;

        do{
            s = sc.nextLine();
            if (tryParseInt(s)){
                retVal = Integer.parseInt(s);
                if (min <= retVal && retVal <=  max){
                    return retVal;
                }
            }
        }while (true);
    }
}
