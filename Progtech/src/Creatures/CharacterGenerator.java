package Creatures;

import Creatures.Castes.Caste;
import Creatures.Castes.Race;
import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterGenerator {

    private CharacterSwitchs cswitch = new CharacterSwitchs();

    public ArrayList<Creature> GetCharacter(ArrayList<Creature> creatures) throws InvalidAgeException, InvalidAttributeException {
        int quit = 0;
        Scanner sc = new Scanner(System.in);
        while(quit != 2) {
            System.out.println("Choose your caste!\n1)Bard   2)Gladiator   3)Headhunter   4)Knight   5)Swordartist   6)Thief   7)Warrior");
            int castegiver = tryParse(sc, 1, 7);
            Caste caste = cswitch.CasteGiver(castegiver);
            System.out.println("Please type in your character's name!");
            String charactername = sc.nextLine();
            System.out.println();
            System.out.println("How old is your character?");
            int age = tryParse(sc, 12, 2500);
            System.out.println("What race would you like to choose?\n1)Human   2)Elf   3)Orc   4)Dwarf");
            int racegiver = tryParse(sc, 1, 4);
            Race race = cswitch.RaceGiver(racegiver);
            System.out.println("What is the starting level?");
            int level = tryParse(sc, 1, 10);
            Creature yourcharacter = cswitch.CharacterBuilder(castegiver, charactername, age, race, caste, level);
            yourcharacter.setPartyMember(true);
            creatures.add(yourcharacter);
            System.out.println("Do you want to generate an other character?\n1)Yes    2)No");
            quit = tryParse(sc, 1, 2);
        }
        return creatures;
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
