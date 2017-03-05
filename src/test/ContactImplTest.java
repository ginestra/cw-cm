package test;

import impl.ContactImpl;
import spec.Contact;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Ginestra Ferraro
 */

public class ContactImplTest {

    private	int contactId;
    private String contactName;
    private String notes;

    private Contact person1, person2, person3, person4, person5;

    // Create mock object
    @Before
    public ContactImpl mockContact() {
        person1 = new ContactImpl(7, "Einstein, Albert", "King of math and physics");
        person2 = new ContactImpl(17, "Galilei, Galileo", "Had to lie to stay alive");
        person3 = new ContactImpl(23, "Lovelace, Ada", "Wish more people knew about her");
        person4 = new ContactImpl(29, "Da Vinci, Leonardo", "Genius");
        person5 = new ContactImpl(77, "Curie, Marie", "Mrs X-rays");
    }

    // Test getId()
    @Ignore
    @Test
    public void getIdTest() {
        // ContactImplTest test = new ContactImplTest();
        int getTheId = person1.getId();
        int expected = 7;
        assertEquals(expected, getTheId);
    }

    // Test getName()
    @Ignore
    @Test
    public void getNameTest() {
        String getTheName = person4.getName();
        String expected = "Da Vinci, Leonardo";
        assertEquals(expected, getTheName);
    }

    // Test getNotes()
    @Ignore
    @Test
    public void getNotesTest() {

    }

    // Test addNotes()
    @Ignore
    @Test
    public void addNotesTest() {

    }

    // Destroy mock object
    @After
    public void cleanUp() {

    }
}
