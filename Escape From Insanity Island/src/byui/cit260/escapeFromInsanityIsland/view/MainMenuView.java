/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.GameControl;
import escape.from.insanity.island.EscapeFromInsanityIsland;

/**
 *
 * @author user
 */
public class MainMenuView extends View {

    public MainMenuView() {
            super("\n"
                  + "\n---------------------------------------"
                  + "\n| Main Menu                           |"
                  + "\n---------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n---------------------------------------"
                  + "\nB - Battle"
                  + "\nC - Construct" 
                  + "\nM - Move");              
    }
   
    @Override
    public boolean doAction (String value){
        value = value.toUpperCase();
        
        switch (value){
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
            case "B":
                this.battleMode();
                break;    
            case "C":
                this.craftMode();
                break;  
            case "M":
                this.moveMode();
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
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called***");
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called***");
    }

    private void battleMode() {
        CombatControlView combatControlView = new CombatControlView();
        combatControlView.display();
    }    
    
    private void craftMode() {
        ConstructionMenuView constructionMenuView = new ConstructionMenuView();
        constructionMenuView.display();
    }
    
    private void moveMode() {
        MovementControlView movementControlView = new MovementControlView();
        movementControlView.display();
    }    
}
