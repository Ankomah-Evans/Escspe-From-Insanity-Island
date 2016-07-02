/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.sizeOfArrow;
import byui.cit260.escapeFromInsanityIsland.exceptions.sizeOfArrowException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class InventoryControlView extends View {

    public InventoryControlView() {
        super("Enter the length and width of the arrow you want to make." +
              "\nHow long do you want the arrow?");
    }

    @Override 
    public boolean doAction(String length) {
        
        this.setDisplayMessage("How wide should the arrow be?");
        String width = this.getInput();
        
        sizeOfArrow soa = new sizeOfArrow();
        try {
        soa.calculateArrowSize(Integer.parseInt(length), Integer.parseInt(width));
        } catch (sizeOfArrowException me){
            System.out.println(me.getMessage());
            
        }
            this.setDisplayMessage("\nHow long do you want the arrow?");
          
        
     
        return true;
    }

    
     
}
		
    
