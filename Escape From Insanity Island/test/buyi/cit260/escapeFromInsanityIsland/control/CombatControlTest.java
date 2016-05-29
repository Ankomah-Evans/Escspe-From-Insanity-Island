/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CombatControlTest {
    
    public CombatControlTest() {
    }

    /**
     * Test of attack method, of class CombatControl.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        /**************************
         * Test Case #1
         **************************/
        System.out.println("\tTest Case #1");
        
        int strength = 15;
        int defense = 6;
        
        int expResult = 90;
        int result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    

         /**************************
         * Test Case #2
         **************************/
        System.out.println("\tTest Case #2");
        
        strength = 48;
        defense = 20;
        
        expResult = -1;
        result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1);   
        
         /**************************
         * Test Case #3
         **************************/
        System.out.println("\tTest Case #3");
        
        strength = -05;
        defense = 0;
        
        expResult = -1;
        result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1);
        
         /**************************
         * Test Case #4
         **************************/
        System.out.println("\tTest Case #4");
        
        strength = 10;
        defense = 3;
        
        expResult = -1;
        result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1);
        
         /**************************
         * Test Case #5
         **************************/
        System.out.println("\tTest Case #5");
        
        strength = 5;
        defense = 6;
        
        expResult = 30;
        result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1); 
        
         /**************************
         * Test Case #6
         **************************/
        System.out.println("\tTest Case #6");
        
        strength = 20;
        defense = 5;
        
        expResult = 100;
        result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1);
        
         /**************************
         * Test Case #7
         **************************/
        System.out.println("\tTest Case #7");
        
        strength = 10;
        defense = 5;
        
        expResult = 50;
        result = CombatControl.attack(strength, defense);
        assertEquals(expResult, result, 0.1);   
        
        
    
}

}
