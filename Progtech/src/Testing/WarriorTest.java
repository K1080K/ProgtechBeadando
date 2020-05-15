package Testing;

import Creatures.Castes.Caste;
import Creatures.Castes.Race;
import Creatures.Castes.Warrior;
import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    @Test
    public void TestWarriorAttributes() throws InvalidAgeException, InvalidAttributeException {
        for(int i = 0; i < 100; i++) {
            Warrior w = new Warrior("Répa",51, Race.DWARF, Caste.WARRIOR, 1);
            assertEquals(true, w.getAlive());
            assertEquals(true, 7 < w.getHealth_andPainResistance().getHealth_points() && w.getHealth_andPainResistance().getHealth_points() < 19);
            assertEquals(true, 7 < w.getAttributes().getWill() && w.getAttributes().getWill() < 19);
            assertEquals(true, 12 < w.getAttributes().getStrength() && w.getAttributes().getStrength() < 20);
            assertEquals(true, 1 < w.getAttributes().getIntelligence() && w.getAttributes().getIntelligence() < 18);
        }
    }
}