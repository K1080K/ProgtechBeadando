package Testing;

import Attributes.AgeAttributeModifiers;
import Creatures.Castes.Bard;
import Creatures.Castes.Caste;
import Creatures.Castes.Race;
import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeAttributeModifiersTest {

    @Test
    public void AgeAModTests() {
        AgeAttributeModifiers test = new AgeAttributeModifiers();

        assertEquals(-5, test.StrengthAgeModifier(Race.HUMAN, 80));
        assertEquals(0, test.DexterityAgeModifier(Race.DWARF, 51));
        assertEquals(-2, test.StrengthAgeModifier(Race.ORC, 12));
    }

    @Test(
            expected = InvalidAgeException.class
    )
    public void invalidAgeTest() throws InvalidAgeException, InvalidAttributeException {
        Bard bard = new Bard("Tier", 8, Race.HUMAN, Caste.BARD, 1);
    }

}