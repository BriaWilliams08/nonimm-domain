package edu.gmu.cs321;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class UsCitizenTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRequestEntry(){
        UsCitizen citizen = new UsCitizen("John", true);
        boolean tst = citizen.requestEntry("Bob");
        assertTrue(tst);
        assertTrue(citizen.existingNonImm.contains("Bob"));
    }
    
    @Test
    public void testRequestEntryInSystem(){
        UsCitizen citizen = new UsCitizen("John", true);
        citizen.requestEntry("Bob");
        boolean tst = citizen.requestEntry("Bob");
        assertFalse(tst); //cannot add duplicates
    }

    @Test
    public void testRequestEntryNotCitizen(){
        UsCitizen citizen = new UsCitizen("John", false);
        boolean tst = citizen.requestEntry("Bob");
        assertFalse(tst);
    }

    @Test
    public void testResponse(){
        UsCitizen citizen = new UsCitizen("John", false);
        boolean tst = citizen.getResponse();
        assertTrue(tst);
    }
}
