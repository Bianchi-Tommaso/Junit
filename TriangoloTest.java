/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Calcolo method, of class Triangolo.
     */
    @Test
    public void testCalcolo() {
        System.out.println("Calcolo");
        Triangolo instance = new Triangolo(3,6,7);
        instance.Calcolo();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Controllo method, of class Triangolo.
     */
    @Test
    public void testControllo() {
        System.out.println("Controllo");
        Triangolo instance = new Triangolo(3,6,7);
        String expResult = "Scaleno";
        String result = instance.Controllo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
