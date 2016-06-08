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
public class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView(){
        this.menu = "\n"
                  + "\n---------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n---------------------------------------"
                  + "\nG - What is the Goal of the game?"
                  + "\nM - How to Move"
                  + "\nT - How to use the Tools you have"
                  + "\nV - View Map"
                  + "\nA - Avoiding traps/Beasts"
                  + "\nQ - Quit"
                  + "\n---------------------------------------";
        
         }

   public void displayHelpMenuView() {
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

    private boolean doAction(String menuOption) {
         menuOption = menuOption.toUpperCase();
        
        switch (menuOption){
            case "G":
                this.goalOfTheGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "T":
                this.howToUseTools();
                break;
            case "V":
                this.viewMap();
                break;
            case "A":
                this.howToAvoidObstacles();
                break;
            default:
                System.out.println("*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfTheGame() {
        System.out.println("*** goalOfTheGame stub function called***");
    }

    private void howToMove() {
        System.out.println("*** howToMove stub function called***");
    }

    private void howToUseTools() {
        System.out.println("*** howToUseTools stub function called***");
    }

    private void viewMap() {
        System.out.println("*** viewMap stub function called***");
    }

    private void howToAvoidObstacles() {
        System.out.println("*** howToAvoidObstacles stub function called***");
    }
    
}
