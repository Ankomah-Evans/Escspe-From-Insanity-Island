/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Player;
import escape.from.insanity.island.EscapeFromInsanityIsland;

/**
 *
 * @author user
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        EscapeFromInsanityIsland.setPlayer(player); // save the player
        
        return player;
        
    }

    public static void createNewGame(Player player) {
        System.out.println("*** createNewGame stub function called");
    }
    
}
