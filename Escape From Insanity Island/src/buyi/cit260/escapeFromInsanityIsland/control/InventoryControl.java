/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.view.InventoryControlView;

/**
 *
 * @author user
 */
public class InventoryControl {
    
    public InventoryControl(){
    }
    
    public int totalArrow(int[] numbers){
         int total = 0;
         InventoryControlView sum = new InventoryControlView();
        boolean result = (boolean) sum.doAction(length);
            for (int i = 0; i < numbers.length;)
                if (result == true){
                    
                total += numbers[i];
                }
                else{
                    break;
                }
            return total;
                }
    
}
