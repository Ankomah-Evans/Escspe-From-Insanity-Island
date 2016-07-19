/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.exceptions.InventoryControlException;
import byui.cit260.escapeFromInsanityIsland.view.InventoryControlView;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class InventoryControl {
    
    public InventoryControl(){
    }
    
    public int totalArrow(int[] numbers)
    throws InventoryControlException {
         int total = 0;
         boolean result = false;
         InventoryControlView sum = new InventoryControlView();
          //  boolean result = (boolean) sum.doAction(length);
            for (int i = 0; i < numbers.length;)
                if (result == true){
                    
                total += numbers[i];
                }
                else{
                    break;
                }
            return total;
                }
    
    
    public ArrayList<BoatParts> addInventoryItems( ) {
        
        // create an ArrayList of inventory items
        ArrayList<BoatParts> inventory = new ArrayList<>();
        
        // adding objects to the end of the ArrayList
        BoatParts planks = new BoatParts("Planks", 20);
        inventory.add(planks);
        
        inventory.add(new BoatParts("Mast", 2));
        inventory.add(new BoatParts("Sail", 1));
        inventory.add(new BoatParts("Oars", 2));
        
        return inventory;        
        
    }
    
    
}
