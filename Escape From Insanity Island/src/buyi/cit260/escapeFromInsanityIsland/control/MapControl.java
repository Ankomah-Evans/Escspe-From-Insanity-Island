/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;


import byui.cit260.escapeFromInsanityIsland.exceptions.MapControlException;
import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.awt.Point;
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

    public static Map createMap() {
        
        // create the map
        Map map = new Map(25, 25);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    public static int moveCharacterToLocation(Character character, Point coordinates) throws MapControlException {
        
        Map map = EscapeFromInsanityIsland.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
                newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move the character to the location "
                                        + coordinates.x + ", " + coordinates.y
                                        + " because that location is outside "
                                        + " the bounds of the map.");
        }
        
        return 0;
    }

    public static int moveCharactersToStartingLocation(Map map) throws MapControlException {
        // for every character
        Character[] character = Character.values();
        
        for (Character character : characters) {
            Point coordinates = character.getCoordinates();
            MapControl.moveActorToLocation(character, coordinates);

        }     
        return 0;
    }

    public static int assignScenesToLocations(Map map, Scene[] scenes) throws MapControlException {
        // for every scene
        Scenes[] scenes = Scenes.values();
        
        for (Scenes scenes : scenes) {
            Point coordinates = scenes.getCoordinates();
            MapControl.assignScenesToLocations(map, scenes)
        }
        return 0;
    }

    public Scene[] createScenes() {
        System.out.println("\n*** assignScenesToLocations() function called ***");
        Scene[] Scene = null;
        return Scene;
    }
    
}

@Override
    public boolean doAction(String choice) {
       Character character = null

    // move actor to specified location
       try {
           MapControl.moveCharacterToLocation(character, coordinates);
           } catch (MapControlException me) {
              System.out.println(me.getMessage());
    }

}

