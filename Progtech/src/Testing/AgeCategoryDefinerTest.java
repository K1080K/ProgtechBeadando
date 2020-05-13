package Testing;

import Attributes.AgeCategoryDefiner;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeCategoryDefinerTest {

    @Test
    public void TestACD() {
        AgeCategoryDefiner test = new AgeCategoryDefiner();

        assertEquals(2, test.DwarfAgeCategories(51));
        assertEquals(6, test.ElfAgeCategories(2000));
        assertEquals(1, test.HumanAgeCategories(14));
    }

}