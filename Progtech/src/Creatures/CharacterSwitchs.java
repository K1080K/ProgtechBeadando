package Creatures;

import Creatures.Castes.*;
import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;

public class CharacterSwitchs {

    public Caste CasteGiver(int castegiver) {
        switch (castegiver) {
            case 1:
                return Caste.BARD;
            case 2:
                return Caste.GLADIATOR;
            case 3:
                return Caste.HEADHUNTER;
            case 4:
                return Caste.KNIGHT;
            case 5:
                return Caste.SWORDARTIST;
            case 6:
                return Caste.THIEF;
            case 7:
                return Caste.WARRIOR;
            default:
                return null;
        }
    }

    public Race RaceGiver(int racegiver) {
        switch (racegiver) {
            case 1:
                return Race.HUMAN;
            case 2:
                return Race.ELF;
            case 3:
                return Race.ORC;
            case 4:
                return Race.DWARF;
            default:
                return null;
        }
    }

    public Creature CharacterBuilder(int castegiver, String name, int age, Race race, Caste caste, int level) throws InvalidAgeException, InvalidAttributeException {
        switch (castegiver) {
            case 1:
                return new Bard(name, age, race, caste, level);
            case 2:
                return new Gladiator(name, age, race, caste, level);
            case 3:
                return new Headhunter(name, age, race, caste, level);
            case 4:
                return new Knight(name, age, race, caste, level);
            case 5:
                return new SwordArtist(name, age, race, caste, level);
            case 6:
                return new Thief(name, age, race, caste, level);
            case 7:
                return new Warrior(name, age, race, caste, level);
            default:
                return null;
        }
    }
}
