package Testing;

import Attributes.SummarizedAttributeModifiers;
import Creatures.Castes.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummarizedAttributeModifiersTest {

    @Test
    public void TestSummarizedAttr() {
        SummarizedAttributeModifiers test = new SummarizedAttributeModifiers();

        assertEquals(0, test.StrengthModifier(Race.HUMAN, 30));
        assertEquals(-1, test.IntelligenceModifier(Race.DWARF, 51));
        assertEquals(2, test.DexterityModifier(Race.ELF, 1200));
    }

}