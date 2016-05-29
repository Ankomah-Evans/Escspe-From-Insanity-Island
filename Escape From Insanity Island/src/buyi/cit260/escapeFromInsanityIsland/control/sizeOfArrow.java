/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

/**
 *
 * @author user
 */
public class sizeOfArrow {
    public static int arrow(int length , int width) {
        if (length < 10 || length > 45) {
            return -1;
        }        
            
        if (width <4 || width > 20) {
            return -1;
        }
        
        
        int sizeOfArrow = length * width;
        
        return sizeOfArrow; 
    }       
    
}
