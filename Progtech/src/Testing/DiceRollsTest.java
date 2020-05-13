package Testing;

import Rolls.DiceRolls;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceRollsTest {

    @Test
    public void TestRolls() {
        DiceRolls test = new DiceRolls();

        assertEquals(true, 0 < test.Rolld6() && test.Rolld6() < 7);
        assertEquals(true, 8 < test.Rolld10plus8x2() && test.Rolld10plus8x2() < 19);
        assertEquals(true, 2 < test.Roll3d6() && test.Roll3d6() < 19);
    }

}