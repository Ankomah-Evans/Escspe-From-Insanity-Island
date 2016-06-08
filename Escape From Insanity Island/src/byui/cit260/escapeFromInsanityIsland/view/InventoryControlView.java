/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.sizeOfArrow;
import escape.from.insanity.island.EscapeFromInsanityIsland;

/**
 *
 * @author user
 */
public class InventoryControlView {

    public InventoryControlView() {
    }

  public  void displayInventoryControlView() {
      
      //  create a new arrow
      int value = sizeOfArrow.createNewArrow(EscapeFromInsanityIsland.getArrow());
      if ( value < 10 && value <4){
          System.out.println();
      }
      // display inventory control
      InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.displayInventoryControlView();
        
    }
    
}
