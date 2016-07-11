/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;
import byui.cit260.escapeFromInsanityIsland.model.Scene;



/**
 *
 * @author hedgehog
 */
public class SceneController {
    
    
    public int[] findSceneName(String SceneName, int[] SceneType) {
        GameControl gamec = new GameControl();
        int length = 6;
        
        // find the scene with the largest travel distance   
        for (int i = 0; i < SceneType.length; i++) {
            // get the scene with the largest travel distance
            if (SceneType[i] == '4') {
            this.console.println(i + "The location with the longest travel distance is The Forest.");
            
            break;
        }
       
    }
        return SceneType;
}

    public void display() {
        String value;
        boolean done = false;
        
        do {
            this.console.println(this.message); // display the prompt message
            value = this.getInput(); // get the user's selection
            done = this.doAction(value); // do action based on selection
            
        } while (!done);
        
    }

    private String getInput() {
        this.console.println("\n*** getInput() function called ***");
        return;
    }

    private boolean doAction(String value) {
        this.console.println("\n*** doAction() function called ***");
        return true;
    }

    
}
