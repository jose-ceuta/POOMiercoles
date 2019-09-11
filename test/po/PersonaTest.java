/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    /**
     * Test of mayoredad method, of class Persona.
     */
    @Test
    public void testMayoredad() {
        System.out.println("mayoredad");
        Persona instance = new Persona();
        instance.setEdad(18);
        
        boolean expResult = true;
        boolean result = instance.mayoredad();
        assertEquals(expResult, result);

        try {
            instance.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
}
