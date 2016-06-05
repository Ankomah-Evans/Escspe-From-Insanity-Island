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
 * @author StarrfoxxW8
 */
public class CombatControlTest {
    
    public CombatControlTest() {
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
        System.out.println("\tattackMob Test case #1");
        
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

        /******************************
         * Test case #2
         *****************************/
        System.out.println("\tattackMob Test case #2");
                
        
        // input values for test case 2
        weapon = 5;
        damage = 25;
        defense = 10;
        health = 110;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);      
        
        /******************************
         * Test case #3
         *****************************/
        System.out.println("\tattackMob Test case #3");
                
        
        // input values for test case 1
        weapon = 5;
        damage = 25;
        defense = 10;
        health = -1;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);  
        
         /******************************
         * Test case #4
         *****************************/
        System.out.println("\tattackMob Test case #4");
                
        
        // input values for test case 4
        weapon = 1;
        damage = 25;
        defense = 10;
        health = 100;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);      
        
        /******************************
         * Test case #5
         *****************************/
        System.out.println("\tattackMob Test case #5");
                
        
        // input values for test case 5
        weapon = 30;
        damage = 25;
        defense = 10;
        health = 100;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);         
        
         /******************************
         * Test case #6
         *****************************/
        System.out.println("\tattackMob Test case #6");
                
        
        // input values for test case 6
        weapon = 5;
        damage = 25;
        defense = -1;
        health = 100;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);      
        
        /******************************
         * Test case #7
         *****************************/
        System.out.println("\tattackMob Test case #7");
                
        
        // input values for test case 7
        weapon = 5;
        damage = 25;
        defense = 25;
        health = 100;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);  
        
         /******************************
         * Test case #8
         *****************************/
        System.out.println("\tattackMob Test case #8");
                
        
        // input values for test case 8
        weapon = 5;
        damage = -1;
        defense = 10;
        health = 100;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);      
        
        /******************************
         * Test case #9
         *****************************/
        System.out.println("\tattackMob Test case #9");
                
        
        // input values for test case 9
        weapon = 5;
        damage = 40;
        defense = 10;
        health = 100;
        
       
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.attackMob(weapon, damage, defense, health);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);  
        
    }

    /**
     * Test of selfHeal method, of class CombatControl.
     */
    @Test
    public void testSelfHeal() {
        System.out.println("selfHeal");
        
        /******************************
         * Test case #1
         *****************************/
        System.out.println("\tselfHeal Test case #1");
        
        // input values for test case 1
        
        int bandage = 5;
        int health = 45;
        int healAmt = 13;
        
        // create instance of CombatControl class
        CombatControl instance = new CombatControl();
        int expResult = 58; // expected output returned value
        
        // create function to run test
        int result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /******************************
         * Test case #2
         *****************************/
        System.out.println("\tselfHeal Test case #2");
        
        // input values for test case 2
        
        bandage = 0;
        health = 45;
        healAmt = 13;
        
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);        
        
         /******************************
         * Test case #3
         *****************************/
        System.out.println("\tselfHeal Test case #3");
        
        // input values for test case 3
        
        bandage = 26;
        health = 45;
        healAmt = 13;
        
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);   
        
        /******************************
         * Test case #4
         *****************************/
        System.out.println("\tselfHeal Test case #4");
        
        // input values for test case 4
        
        bandage = 5;
        health = 0;
        healAmt = 13;
        
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);        
        
         /******************************
         * Test case #5
         *****************************/
        System.out.println("\tselfHeal Test case #5");
        
        // input values for test case 5
        
        bandage = 5;
        health = 100;
        healAmt = 13;
        
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);    
        
        /******************************
         * Test case #6
         *****************************/
        System.out.println("\tselfHeal Test case #6");
        
        // input values for test case 6
        
        bandage = 5;
        health = 45;
        healAmt = 0;
        
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);        
        
         /******************************
         * Test case #7
         *****************************/
        System.out.println("\tselfHeal Test case #7");
        
        // input values for test case 7
        
        bandage = 5;
        health = 45;
        healAmt = 20;
        
        expResult = -1; // expected output returned value
        
        // create function to run test
        result = instance.selfHeal(bandage, health, healAmt);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);         
        
    }
    
}

