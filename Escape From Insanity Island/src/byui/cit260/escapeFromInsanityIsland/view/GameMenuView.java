/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GameMenuView extends View {

    public GameMenuView() {
            super("\n"
                  + "\n---------------------------------------"
                  + "\n    Enter Your Mood!"
                  + "\n---------------------------------------"
                  + "\nC - Cunfused"
                  + "\nA - Angry"
                  + "\nW - Worried"
                  + "\nH - Happy"
                  + "\nQ - Quit"
                  + "\n---------------------------------------");
        
    }
    
    @Override

    public boolean doAction(String value) {
        value = value.toUpperCase();
         switch (value){
            case "C":
                 this.confusedInventory();
                 break;
            case "A":
                this.angryInventory();
                break;
            case "W":
                this.worriedInventory();
                break;
            case "H":
                this.happyInventory();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"*** That's an emotion I don't understand. Try another one. ***");
                break;
         }
       return false; 
    }

    private void confusedInventory() {
        
                this.console.println("\n*** confusedInvetory() called ***");
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display();
    }

    private void angryInventory() {
        
                this.console.println("\n*** angryInventory() called ***");
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display(); 
    }

    private void worriedInventory() {
        
                this.console.println("\n*** worriedInventory() called ***");
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display();
    }

    private void happyInventory() {
        
                this.console.println("\n*** happyInventory() called ***");
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display();
    }
    
}
