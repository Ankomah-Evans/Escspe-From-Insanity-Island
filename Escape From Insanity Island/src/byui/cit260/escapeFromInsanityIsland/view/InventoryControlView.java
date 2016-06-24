/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.sizeOfArrow;
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
        int arrowSize = soa.calculateArrowSize(Integer.parseInt(length), Integer.parseInt(width));
        if (arrowSize == -1 ) {
            System.out.println("The length of the arrow must be between 10 and 45, and" +
                               "\nThe width of the arrow must be between 4 and 20." +
                               "\nPlease try again");
            this.setDisplayMessage("\nHow long do you want the arrow?");
            return false;
        } else {
            System.out.println("Congratulations! You created an arrow that is" +
                               "\n " + arrowSize);
            return true;
        }
        
    }

    
     
}
		
    