/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Ground;
import byui.cit260.escapeFromInsanityIsland.model.Location;
import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.Resources;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
// import jdk.management.resource.ResourceType;

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
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("this the scene of the game");
        sceneOne.setTimeTravelled(15.00);
        sceneOne.setBlockedLocation("blocked");
        sceneOne.setDisplaySymbol("crest, stop");
        sceneOne.setNoOfItems(9);
        sceneOne.setWeather(true);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(8);
        mapOne.setColumnCount(9);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Ground groundOne = new Ground();
        
        groundOne.setFootPatterns("animal and human food steps");
        groundOne.setBentFoliage("bent grass");
        
        String groundInfo =groundOne.toString();
        System.out.println(groundInfo);
        
        Resources resourcesOne = new Resources();
        
        resourcesOne.setDescription("these are the rest to help you complete the game");
        resourcesOne.setResource("sword,knife,shild,arrow,bow etc.");
        
        
        
        
        
        
        
        
    }
    
    
        
    }
