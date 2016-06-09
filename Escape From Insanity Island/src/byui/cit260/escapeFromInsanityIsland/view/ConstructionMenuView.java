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
public class ConstructionMenuView {
	
	private String menu;

    public ConstructionMenuView() {
		
        this.menu =   "\n---------------------------------------"
                    + "\n|          Construction Menu          |"
                    + "\n---------------------------------------"
                    + "\n|                                     |"
                    + "\n| T - Craft Tool                      |"
                    + "\n| W - Craft Weapon                    |"
                    + "\n| A - Craft Armor                     |"
                    + "\n| I - Craft Items                     |"
                    + "\n| X - Exit Menu                       |"
                    + "\n|                                     |"							
                    + "\n---------------------------------------";
    }
    
    public void craftingMenu() {
		
        boolean done = false; // set flag to not done
        do{
            //display Construction Menu and wait for user to select an option
            String menuOption = this.getUserInput();
            if (menuOption.toUpperCase().equals("Q") )// user wants to exit the menu)
                        return; // exit the menu
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);   
        }

    private String getUserInput() {
		
        Scanner Keyboard = new Scanner (System.in);
		String selection = "";		
		boolean valid = false;
		
		// loop until a valid option has been selected
		while (!valid){ 
			System.out.println("\n" + this.menu);
			 
			// get the selection the user inputted from the keyboard
			selection = Keyboard.nextLine();
			selection = selection.trim();
			 
			if (selection.length()< 1) { // nothing is entered
				System.out.println("\nWhat game are you playing? Try typing a key and THEN pressing the Enter key");
				continue;    
			}
			
			break; // end the loop
		}
		
		return selection; // return the user's selection
    }

	
    private boolean doAction (String choice){
		
		choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "T": 
                this.startCraftTool();
                break;
            case "W":
                this.startCraftWeapon();
                break;
            case "A":
                this.startCraftArmor();
                break;
            case "I":
                this.startCraftItem();
                break;
            case "X":
                this.exitMenu();
                break;				
            default:
                System.out.println("\n*** What option is that? Try again, bud.");
                break;
        }
        return false;       
    }
	
    // display the construction menu

    private void startCraftTool() {
		System.out.println("\n*** startCraftTool() called ***");		
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

    private void startCraftWeapon() {
		System.out.println("\n*** startCraftWeapon() called ***");			
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

    private void startCraftArmor() {
		System.out.println("\n*** startCraftArmor() called ***");			
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

    private void startCraftItem() {
		System.out.println("\n*** startCraftItem() called ***");			
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }
	
    private void exitMenu() {
				
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

}