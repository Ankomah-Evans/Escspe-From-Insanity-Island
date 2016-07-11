/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;


import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Scene;

/**
 *
 * @author user
 */
public class MapControl {

    public static Map createMap() {
        
        // create the map
        Map map = new Map(25, 25);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }


    static void moveCharactersToStartingLocation(Map map) {
        this.console.println("\n*** moveCharactersToStartingLocation() function called ***");
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        this.console.println("\n*** assignScenesToLocations() function called ***");
    }

    private static Scene[] createScenes() {
        this.console.println("\n*** assignScenesToLocations() function called ***");
        Scene[] Scene = null;
        return Scene;
    }
    
}
