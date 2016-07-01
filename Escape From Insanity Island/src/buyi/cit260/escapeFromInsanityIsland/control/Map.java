/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Scene;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Map implements Serializable {

    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    private Scene scene;
    private ArrayList<Character> characters;
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        System.out.println("The number of rows and columns must be > zero");
    }
    
    this.noOfRows = noOfRows;
    this.noOfColumns = noOfColumns;
    
    // create 2-D array for Location objects
    this.locations = new Location[noOfRows] [noOfColumns];
    
    for (int row = 0; row < noOfRows; row++) {
        for(int column = 0; column < noOfColumns; column++) {
            // create and initialize new Location object instance
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            //assign the Location object to the current position in array
            locations[row][column] = location;
        }
    }

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

