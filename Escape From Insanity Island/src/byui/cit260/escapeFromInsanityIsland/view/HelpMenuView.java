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
public class HelpMenuView extends View {
    
    public HelpMenuView(){
            super ("\n"
                  + "\n---------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n---------------------------------------"
                  + "\nG - What is the Goal of the game?"
                  + "\nM - How to Move"
                  + "\nT - How to use the Tools you have"
                  + "\nV - View Map"
                  + "\nA - Avoiding traps/Beasts"
                  + "\nQ - Quit"
                  + "\n---------------------------------------");
        
         }
    @Override

    public boolean doAction(String value) {
         value = value.toUpperCase();
        
        switch (value){
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
                ErrorView.display(this.getClass().getName(),"*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfTheGame() {
        this.console.println("*** goalOfTheGame stub function called***");
    }

    private void howToMove() {
        this.console.println("*** howToMove stub function called***");
    }

    private void howToUseTools() {
        this.console.println("*** howToUseTools stub function called***");
    }

    private void viewMap() {
        this.console.println("*** viewMap stub function called***");
    }

    private void howToAvoidObstacles() {
        this.console.println("*** howToAvoidObstacles stub function called***");
    }
    
}
