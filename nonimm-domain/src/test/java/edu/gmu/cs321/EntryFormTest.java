
package edu.gmu.cs321;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class EntryFormTest {

    private EntryForm entryForm;

    // Before setup
    @Before
    public void setUp() {
        entryForm = new EntryForm(1, 5, "Entry");
    }

    @Test
    // Test getter for formid
    public void testGetFormId() {
        assertEquals(1, entryForm.getformid());
    }

    @Test
    // Test setter for formid
    public void testSetFormId() {
        entryForm.setformid(2);
        assertEquals(2, entryForm.getformid());
    }

    @Test
    // Test getter for date
    public void testGetDate() {
        assertEquals(5, entryForm.getdate());
    }

    @Test
    // Test setter for date
    public void testSetDate() {
        entryForm.setdate(5);
        assertEquals(5, entryForm.getdate());
    }

    @Test
    // Test getter for step
    public void testGetStep() {
        assertEquals("Entry", entryForm.getStep());
    }

    @Test
    // Test setter for step with valid input
    public void testSetStepValid() {
        entryForm.setStep("Review");
        assertEquals("Review", entryForm.getStep());
    }

    @Test
    // Test setter for step with invalid input
    public void testSetStepInvalid() {
        try {
            entryForm.setStep("InvalidStep");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid step!", e.getMessage());
        }
    }
}

