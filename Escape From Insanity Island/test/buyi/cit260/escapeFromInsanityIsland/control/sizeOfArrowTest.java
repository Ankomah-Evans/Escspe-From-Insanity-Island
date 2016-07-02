/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.exceptions.sizeOfArrowException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @Ankomah
 */
public class sizeOfArrowTest {
    
    public sizeOfArrowTest() {
    }

    /**
     * Test of arrow method, of class sizeOfArrow.
     */
    @Test
    public void testArrow() 
        throws sizeOfArrowException{
        System.out.println("arrow");
        /**************************
         * Test Case #1
         **************************/
        System.out.println("\tTest Case #1");
        int length = 20;
        int width = 10;
        sizeOfArrow instance = new sizeOfArrow();
        int expResult = 200;
        int result = instance.calculateArrowSize(length, width);
        assertEquals(expResult, result);
        
        
        /**************************
         * Test Case #2
         **************************/
      /*  System.out.println("\tTest Case #2");
        length = 5;
        width = 20;
        expResult = -1;
        int result = instance.calculateArrowSize(length, width);
        assertEquals(expResult, result);
        
        /**************************
         * Test Case #3
         **************************/
      /*  System.out.println("\tTest Case #3");
        length = -1;
        width = 25;
        expResult = -1;
        result = sizeOfArrow.arrow(length, width);
        assertEquals(expResult, result);
        
        /**************************
         * Test Case #4
         **************************/
       /* System.out.println("\tTest Case #4");
        length = 40;
        width = 3;
        expResult = -1;
        result = sizeOfArrow.arrow(length, width);
        assertEquals(expResult, result);
        
        /**************************
         * Test Case #5
         **************************/
       /* System.out.println("\tTest Case #5");
        length = 10;
        width = 15;
        expResult = 150;
        result = sizeOfArrow.arrow(length, width);
        assertEquals(expResult, result);
        
        /**************************
         * Test Case #6
         **************************/
       /* System.out.println("\tTest Case #6");
        length = 35;
        width = 10;
        expResult = 350;
        result = sizeOfArrow.arrow(length, width);
        assertEquals(expResult, result);
        
        /**************************
         * Test Case #7
         **************************/
       /* System.out.println("\tTest Case #7");
        length = 15;
        width = 20;
        expResult = 300;
        result = sizeOfArrow.arrow(length, width);
        assertEquals(expResult, result);*/
    }
    
}
