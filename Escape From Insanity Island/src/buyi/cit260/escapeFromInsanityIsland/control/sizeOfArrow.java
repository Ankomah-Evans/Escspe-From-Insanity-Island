/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Player;

/**
 *
 * @author user
 */
public class sizeOfArrow {
    
    public sizeOfArrow () {        
    }
    
    public int calculateArrowSize(int length , int width) {
        if (length < 10 || length > 45) {
            return -1;
        }        
            
        if (width <4 || width > 20) {
            return -1;
        }
        
        
        int sizeOfArrow = length * width;
        
        return sizeOfArrow; 
    }       

    public static int createNewArrow(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools Templates.
    }
    
}
