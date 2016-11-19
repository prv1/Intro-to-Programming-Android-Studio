/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pti.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phillipviau
 */
public class DVDSoundTrackTest {
    
    public DVDSoundTrack createOneTest(){
        return new DVDSoundTrack("Song", "Phillip", "English", "mp3");
    }
    
    public DVDSoundTrackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class DVDSoundTrack.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        DVDSoundTrack instance = createOneTest();
        String expResult = "Song";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getArtist method, of class DVDSoundTrack.
     */
    @Test
    public void testGetArtist() {
        System.out.println("getArtist");
        DVDSoundTrack instance = createOneTest();
        String expResult = "Phillip";
        String result = instance.getArtist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLanguage method, of class DVDSoundTrack.
     */
    @Test
    public void testGetLanguage() {
        System.out.println("getLanguage");
        DVDSoundTrack instance = createOneTest();
        String expResult = "English";
        String result = instance.getLanguage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFormat method, of class DVDSoundTrack.
     */
    @Test
    public void testGetFormat() {
        System.out.println("getFormat");
        DVDSoundTrack instance = createOneTest();
        String expResult = "mp3";
        String result = instance.getFormat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
