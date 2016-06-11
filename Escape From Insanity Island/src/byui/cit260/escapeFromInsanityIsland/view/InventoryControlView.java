/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class InventoryControlView {

    public InventoryControlView() {
    }

  public  void displayInventoryControlView() {
		
        Scanner Keyboard = new Scanner (System.in);
		String selection = "";		
		boolean valid = false;
		
		// loop until a valid option has been selected
		while (!valid){ 
			System.out.println("\n");
			 
			// get the selection the user inputted from the keyboard
			selection = Keyboard.nextLine();
			selection = selection.trim();
			 
			if (selection.length()< 1) { // nothing is entered
				System.out.println("\nMake a selection to get the weapon for you mood");
                                this.doAction();                                       
				continue;    
			}
			
			break; // end the loop
		}
    }

    private void doAction() {
        
    }

    
     
}
		
    