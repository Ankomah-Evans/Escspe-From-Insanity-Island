/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.model.Game;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.awt.Point;
import java.io.PrintWriter;
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

    public enum character {
        Jack, 
        Jessie,
        Emily,
        Ruth;
    }
    private void confusedInventory() {
        
         InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display();
    }

    private void angryInventory() {
        
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display(); 
    }

    private void worriedInventory() {
        
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display();
    }

    private void happyInventory(){   
        InventoryControlView inventoryControlView = new InventoryControlView();
        inventoryControlView.display();
    
    }
    /*
    private void displayCharacters() {
        this.viewCharacters(EscapeFromInsanityIsland.getOutFile()); // causing an error
    }
    */
    
    /* This is causing an error  
    private void viewCharacters(PrintWriter out) {
        Game game = EscapeFromInsanityIsland.getCurrentGame(); // error here
        out.println("\n    LIST OF CHARACTERS");
        StringBuilder line = new StringBuilder("                                                          ");
        line.insert(0, "NAME"); 
        line.insert(10, "LOCATION");
        out.println(line.toString());
        
        character[] characters = character.values();
        for (character character : characters) {
            Point coordinates = game.getCharactersLocation()[character.ordinal()];
            line = new StringBuilder("                                                          ");
            line.insert(0, character.name());
            int row = coordinates.x+1;
            int column = coordinates.y+1;
            line.insert(15,  + row + ", " + column);
            out.println(line.toString());
        }   */
}



