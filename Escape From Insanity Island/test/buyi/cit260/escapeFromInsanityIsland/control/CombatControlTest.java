/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author StarrfoxxW8
 */
public class CombatControlTest {
    
    public CombatControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of attackMob method, of class CombatControl.
     */
    @Test
    public void testAttackMob() {
        System.out.println("attackMob");
        
        /******************************
         * Test case #1
         *****************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int weapon = 5;
        int damage = 25;
        int defense = 10;
        int health = 100;
        
        // create instance of CombatControl class
        CombatControl instance = new CombatControl();
        
        int expResult = 80; // expected output returned value
        
        // create function to run test
        int result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        /******************************
         * Test case #2
         *****************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        weapon = 5;
        damage = 25;
        defense = 10;
        health = 110;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        /******************************
         * Test case #3
         *****************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        weapon = 5;
        damage = 25;
        defense = 10;
        health = -1;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");        
        
        /******************************
         * Test case #4
         *****************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        weapon = 1;
        damage = 25;
        defense = 10;
        health = 100;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");     
        
        /******************************
         * Test case #5
         *****************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        weapon = 30;
        damage = 25;
        defense = 10;
        health = 100;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");     
        
        /******************************
         * Test case #6
         *****************************/
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        weapon = 5;
        damage = 25;
        defense = -1;
        health = 100;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");           
        
        /******************************
         * Test case #7
         *****************************/
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        weapon = 5;
        damage = 25;
        defense = 25;
        health = 100;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");    
        
        /******************************
         * Test case #8
         *****************************/
        System.out.println("\tTest case #8");
        
        // input values for test case 8
        weapon = 5;
        damage = -1;
        defense = 10;
        health = 100;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");           
        
        /******************************
         * Test case #9
         *****************************/
        System.out.println("\tTest case #9");
        
        // input values for test case 9
        weapon = 5;
        damage = 40;
        defense = 10;
        health = 100;
        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");           
        
    }
    
}
