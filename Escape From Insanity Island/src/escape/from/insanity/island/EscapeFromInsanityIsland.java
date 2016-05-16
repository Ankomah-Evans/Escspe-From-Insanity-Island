/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Location;
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
    

        Game gameOne = new Game();
    
        gameOne.setTotalTime(10.00);
        gameOne.setNoPeople(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Location locationOne = new Location();
                
        locationOne.setRow(4);
        locationOne.setColumn(4);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(5);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        
    }
    
    
        
    }
