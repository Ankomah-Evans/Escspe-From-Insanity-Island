/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;
import java.util.Scanner;

/**
 *
 * @author StarrfoxxW8
 */
public class CombatControlView {
		
    public String combatInput() {
		
        Scanner Keyboard = new Scanner (System.in);
		String selection = "";		
		boolean valid = false;
		
		// loop until a valid option has been selected
		while (!valid){ 
			System.out.println("\nYou have entered a battle!");
			 
			// get the selection the user inputted from the keyboard
			selection = Keyboard.nextLine();
			selection = selection.trim();
			 
			if (selection.length()< 1) { // nothing is entered
				System.out.println("\nLiving life dangerously, eh? You might want to decide what to do before that beast tears you apart.");
                                this.doAction();                                       
				continue;    
			}
			
			break; // end the loop
		}
		
		return selection; // return the user's selection
    }


    private String doAction (){
		
		String battleChoice = null;
		if (battleChoice.toUpperCase().equals("A")) // user attacks
			return "You attack!";
                
                else if (battleChoice.toUpperCase().equals("H")) // user heals
                        return "You flee like a yellow-bellied coward.";
			
		else if (battleChoice.toUpperCase().equals("F")) // user flees battle
			return "You flee like a yellow-bellied coward.";
			
		else
			return "Well, that didn't do anything. Maybe you should go back and read the instructions.";
		
    }

    void display() {
        System.out.println("\n*** display() called ***");
    }
}    
