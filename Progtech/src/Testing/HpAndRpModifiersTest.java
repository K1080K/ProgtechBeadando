package Testing;

import CombatAndHealth.HpAndRpModifiers;
import org.junit.Test;

import static org.junit.Assert.*;

public class HpAndRpModifiersTest {

    @Test
    public void TestHPRPMods() {
        HpAndRpModifiers test = new HpAndRpModifiers();

        assertEquals(0, test.HealthPointModifier(10));
        assertEquals(8, test.HealthPointModifier(18));
        assertEquals(12, test.ResistancePointModifier(16,16));
    }

}