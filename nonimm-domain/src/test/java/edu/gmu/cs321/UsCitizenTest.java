package edu.gmu.cs321;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for UsCitizen.
 */
public class UsCitizenTest 
{
    // checks if the new nonimmigrant is successfully added to the list
    @Test
    public void testRequestEntry(){
        UsCitizen citizen = new UsCitizen("John", true);
        boolean tst = citizen.requestEntry("Bob");
        assertTrue(tst);
        assertTrue(citizen.existingNonImm.contains("Bob"));
    }
    
    // checks if a US citizen is able to request a nonimmigrant entry twice
    @Test
    public void testRequestEntryInSystem(){
        UsCitizen citizen = new UsCitizen("John", true);
        citizen.requestEntry("Bob");
        boolean tst = citizen.requestEntry("Bob");
        assertFalse(tst); //cannot add duplicates
    }

    // checks if a non-US citizen is able to request nonimmigrant entry
    @Test
    public void testRequestEntryNotCitizen(){
        UsCitizen citizen = new UsCitizen("John", false);
        boolean tst = citizen.requestEntry("Bob");
        assertFalse(tst);
    }

    // checks the status of the form
    @Test
    public void testResponse(){
        UsCitizen citizen = new UsCitizen("John", true);
        boolean tst = citizen.getResponse();
        assertTrue(tst);
    }
}
