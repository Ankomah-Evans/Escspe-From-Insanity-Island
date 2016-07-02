/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.exceptions.sizeOfArrowException;
import byui.cit260.escapeFromInsanityIsland.model.Player;

/**
 *
 * @author user
 */
public class sizeOfArrow {
    
    private String promptMessage = "createNewArrow stub function called";
    public sizeOfArrow () {        
    }
    
    public int calculateArrowSize(int length , int width) 
             throws sizeOfArrowException {
        
        if (length < 10 || length > 45) {
            throw new sizeOfArrowException ("Invlid Entry. Plese enter a value between 10 and 45");
        }        
            
        if (width <4 || width > 20) {
            throw new sizeOfArrowException ("Invlid Entry. Plese enter a value between 4 and 20");
        }
        
        
        int sizeOfArrow = length * width;
        
        return sizeOfArrow; 
    }       

    public int createNewArrow(Player player) 
           throws sizeOfArrowException {
        
        System.out.println(promptMessage);
        return Integer.parseInt(promptMessage);
       
    }
    
}
