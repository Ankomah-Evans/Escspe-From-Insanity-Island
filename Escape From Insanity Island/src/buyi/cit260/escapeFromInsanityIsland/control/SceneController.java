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
            System.out.println(i + "The location with the longest travel distance is The Forest.");
            break;
        }
       
    }
        return SceneType;
}

    public void display() {
        System.out.println("display() called.");
    }
    
}
