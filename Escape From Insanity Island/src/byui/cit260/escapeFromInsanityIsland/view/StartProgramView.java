/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.GameControl;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StartProgramView {
    
    private String promptMessage;
    public StartProgramView() {
        this.promptMessage = "Please enter your name:";
        // display the banner when this is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n********************************************************"
               +"\n* This is the game of Escape from Insanity Island      *"
               +"\n* In the game, the character wakes up with no memory   *"
               +"\n* of who they are (other than name).                   *"
               +"\n* The only thing they know is what they currently see  *"
               +"\n* You are not sure how they got there.                 *"
               +"\n* They have to decide to explore the island or stay at *"
               +"\n* the location                                         *"
               +"\n* In order to progress, they must choose to explore the*"
               +"\n* island, find resources to make tools, medicine,      *"
               +"\n* weapons armor, and find a way to escape the island.  *"
               +"\n* There are traps to avoid and beasts prowling the     *"
               +"\n* jungle. While searching for a way out, clues will be *"
               +"\n* given like,foot patterns to follow, bent weeds and   *"
               +"\n* grass to youa hint you of where to go, providing more*"
               +"\n* ideas as to who you are and how you got there. The   *"
               +"\n* user will have different choices to make based on    *"
               +"\n* the traps encountered When the user makes to the end *"
               +"\n* of theisland, a boat can be made with the scraps that*"
               +"\n* were found, or the user can choose to join the local *"
               +"\n* tribe. A winning message and picture will be         *"
               +"\n* displayed to the user.                               *"
               +"\n********************************************************"
               );
               
    }
    /**
     * display the start program view
     */
    public void displayStartProgramView() {
        boolean done = false; //set flag to not done
        do {
           // prompt for and get playersName
           String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quiet
                return; // exist the game
            //do requested action and display next view
            done = this.doAction(playersName);
        } while (!done);
        
    }   

    private String getPlayersName() {

     // Scanner Keyboard = new Scanner (System.in); // we no longer need this get infile for keyboard
     // String value = ""; // value to be returned // removing this
     
     boolean valid = false; // initialize to not valid
     String selection = null;
     
     try {
     
        while (!valid){ // loop while an invalid value is enter
            // System.out.println("\n" + this.promptMessage);

            // get the value entered from the keyboard
            selection = this.keyboard.readLine();
            selection = selection.trim();

            if (selection.length()< 1) { // blank value entered
                ErrorView.display(this.getClass().getName(),
                                    "You must enter a value");
                continue;    
            }
            
            break; // end the loop
            
        }
     } catch (Exception e) {
         ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
         return null;
    }
     
    return selection; // return the value entered
}

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){ // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;    
        }
        // display next view
        this.displayNextView(player);
        
        return true; // success!
    }
        private void displayNextView(Player player) {
        System.out.println("\n========================================"
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!"
                          +"\n========================================"
                          );
        // create MainMenuView Object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    
        }

    public void display() {
        System.out.println("Called display()");
    }

    public void readLine() {
            System.out.println("Called readLine()");
    } 
    
}

