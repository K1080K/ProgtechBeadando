import java.util.ArrayList;
import java.util.Random;

public class DiceRolls {

    public static Random rnd = new Random();

    //region Basic Dice Rolls d6, d10, d100

    public int Rolld6(){
        int roll = (1 + rnd.nextInt(6));
        return roll;
    }

    public int Rolld10(){
        int roll = (1 + rnd.nextInt(10));
        return roll;
    }

    public int Rolld100(){
        int roll = (1 + rnd.nextInt(100));
        return roll;
    }

    //endregion

    //region AttributeRolls

    public int Roll3d6(){
        int roll = Rolld6() + Rolld6() + Rolld6();
        return roll;
    }

    public int Roll3d6x2(){
        int a = Rolld6() + Rolld6() + Rolld6();
        int b = Rolld6() + Rolld6() + Rolld6();
        if(a < b) return b;
        else return a;
    }

    public int Roll2d6plus6(){
        int roll = Rolld6() + Rolld6() + 6;
        return roll;
    }

    public int Rolld10plus8(){
        int roll = Rolld10() + 8;
        return roll;
    }

    public int Rolld10plus8x2(){
        int a = Rolld10() + 8;
        int b = Rolld10() + 8;
        if(a < b) return b;
        else return a;
    }

    public int Rolld10plus10(){
        int roll = Rolld10() + 10;
        return roll;
    }

    public int Rolld6plus12(){
        int roll = Rolld6() + 12;
        return roll;
    }

    //endregion

    public int RollRandomTarget(ArrayList<Creature> creatures) {
        int target = (1 + rnd.nextInt(creatures.size()));
        return target;
    }

}
