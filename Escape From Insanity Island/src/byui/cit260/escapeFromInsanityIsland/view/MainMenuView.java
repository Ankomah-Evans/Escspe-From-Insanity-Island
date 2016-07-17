/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.GameControl;
import buyi.cit260.escapeFromInsanityIsland.control.SceneController;
import buyi.cit260.escapeFromInsanityIsland.control.WorldResources;
import byui.cit260.escapeFromInsanityIsland.model.Player;
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
                  + "\nM - Move"   
                  + "\nL - Find location with longest travel time");              
    }
   
    @Override
    public boolean doAction (String value){
        value = value.toUpperCase();
        
        switch (value){
            /* case "N": 
                this.startNewGame();
                break; */
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            /* case "S":
                this.saveGame();
                break; */
            case "B":
                this.battleMode();
                break;    
            case "C":
                this.craftMode();
                break;  
            case "R":
                this.WorldResourceList();
                break;     
            /* case "L":
                this.locationName();
                break;      */
            case "M":
                this.moveMode();
                break; 
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;

        
    }
        private String menu;

    /* private void startNewGame() {
        GameControl.createNewGame(escapeFromInsanityIsland.getPlayer());
   
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        //THIS IS WHERE YOU WILL MAKE THE CALL TO GO TO THE VIEW FOR THE 
        //STARTING LOCATION FOR THE USER
    } */

    private void startExistingGame() {
        this.console.println("*** startExistingGame function called***");
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    /*
    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            +   "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(EscapeFromInsanityIsland.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
*/

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

    private void WorldResourceList() {
        StringBuilder line;
        
        // Game game = EscapeFromInsanityIsland.getCurrentGame();
        // WorldResources[] resource = game.getResource();
        
        System.out.println("\n                LIST OF RESOURCES");
        line = new StringBuilder("                             ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        Iterable<WorldResources> inventory = null;
        
        // for each inventory item
        for (WorldResources resource : inventory) {
            line = new StringBuilder("                           ");
            line.insert(0, resource.getDescription());
            line.insert(23, resource.getRequiredAmount());
            line.insert(33, resource.getQuantityInStock());
            
        // Display the line
        System.out.println(line.toString());
        }
    }

    /*
    private void locationName() {
        SceneController sceneController = new SceneController();
        sceneController.display();
    } */

    private static class escapeFromInsanityIsland {

        private static Player getPlayer() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public escapeFromInsanityIsland() {
        }
    }
}
