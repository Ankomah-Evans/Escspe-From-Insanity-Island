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
        this.promptMessage = "nPlease enter your name:";
        // display the banner when this is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n********************************************************"
               +"\n* This si the game of Escape from Insanity Island      *"
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
        /*
        WHILE valid value has not be entered
            DISPLAY promtMessage
            GET the value entered from keyboard
            TRIM front and trailing blanks off of the name
        
            IF the length of the value is blank THEN
                DISPLAY "Invalid value: The value can not be blank"
                CONTINUE
            ENDIF
        
            BREAK
        ENDWHILE
        RETURN name
       */
     Scanner Keyboard = new Scanner (System.in); // get infile for keyboard
     String value = ""; // value to be returned
     boolean valid = false; // initialize to not valid
     
     while (!valid){ // loop while an invalid value is enter
         System.out.println("\n" + this.promptMessage);
         
         value = Keyboard.nextLine(); // get next line typed on keyboard
         value = value. trim(); // trim off leading and trailing blanks
         
         if (value.length()< 1) { // value is blank
             System.out.println("\nInvalid value: value can not be blank");
             continue;    
         }
         break; // end the loop
    }
    return value; // return the value entered
}

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in legth");
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
        mainMenuView.displayMainMenuView();
    
        }
        
   
}

    
    

