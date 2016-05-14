/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.Resources;

/**
 *
 * @author user
 */
public class EscapeFromInsanityIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("Castaway Carl");
        playerOne.setHighScore(1500);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
        
        
}
