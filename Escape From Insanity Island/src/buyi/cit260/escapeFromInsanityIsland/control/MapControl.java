/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;


import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class MapControl {
    
    private PrintWriter console;
    
        public void MapControl() {
            this.console = EscapeFromInsanityIsland.getOutFile();
        }

    public Map createMap() {
        
        // create the map
        Map map = new Map(25, 25);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }


    public void moveCharactersToStartingLocation(Map map) {
        this.console.println("\n*** moveCharactersToStartingLocation() function called ***");
    }

    public void assignScenesToLocations(Map map, Scene[] scenes) {
        this.console.println("\n*** assignScenesToLocations() function called ***");
    }

    public Scene[] createScenes() {
        this.console.println("\n*** assignScenesToLocations() function called ***");
        Scene[] Scene = null;
        return Scene;
    }
    
}
