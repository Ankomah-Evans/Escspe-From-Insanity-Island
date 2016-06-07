/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.GameControl;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainMenuView {

    public MainMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------"
                  + "\n| Main Menu                           |"
                  + "\n---------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n---------------------------------------";
    }
    
    public void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q") )// user wants to quit)
                        return; // exist the game
            
            // do the requested action and display the next view
            done = this. doAction(menuOption);
        } while (!done);   
        }

      private String getMenuOption() {
         Scanner Keyboard = new Scanner (System.in); // get infile for keyboard
     String value = ""; // value to be returned
     boolean valid = false; // initialize to not valid
     
     while (!valid){ // loop while an invalid value is enter
         System.out.println("\n" + this.menu);
         
         value = Keyboard.nextLine(); // get next line typed on keyboard
         value = value. trim(); // trim off leading and trailing blanks
         
         if (value.length()< 1) { // value is blank
             System.out.println("\nInvalid value: value can not be blank");
             continue;    
         }
         break; // end the loop
    }
    return value;
    } 
    private boolean doAction (String menuOption){
        menuOption = menuOption.toUpperCase();
        
        switch (menuOption){
            case "N": 
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

        
    }
        private String menu;

    private void startNewGame() {
        GameControl.createNewGame(EscapeFromInsanityIsland.getPlayer());
   
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called***");
    }
}
