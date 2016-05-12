/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byu.cit260.escapeFromInsanityIsland.model.Player;

/**
 *
 * @author StarrfoxxW8
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
