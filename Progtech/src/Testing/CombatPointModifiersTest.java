package Testing;

import CombatAndHealth.CombatPointModifiers;
import Creatures.Castes.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombatPointModifiersTest {

    @Test
    public void TestCPM() {
        CombatPointModifiers test = new CombatPointModifiers();

        assertEquals(2, test.DamageModifier(18));
        assertEquals(18, test.AttackPointModifiers(18, 15, 15));
        assertEquals(2, test.InitiativePointModifiers(7,12));
    }

}