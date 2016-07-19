/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.sizeOfArrow;
import byui.cit260.escapeFromInsanityIsland.exceptions.sizeOfArrowException;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class InventoryControlView extends View {

    private String promptMessageLength;
    private String promptMessageWidth;
   // private int arrowSize;
    
    protected final BufferedReader keyboard = EscapeFromInsanityIsland.getInFile();
    protected final PrintWriter console = EscapeFromInsanityIsland.getOutFile();
    
    public InventoryControlView() {
        
    
    }

    public int display(String ArrowItem) {
        // super("Enter the length and width of the arrow you want to make.");
         
        this.promptMessageLength = "Enter the length of the Arrow";
        this.promptMessageWidth = "Enter the width of the Arrow";
        boolean finished = false;
        
        try{
        while(!finished){
            this.console.println("\n" + this.promptMessageLength);
           String length = this.getInput();
            if(parseInt(length) == -1){
                finished = true;
                this.console.println("You canceled");
                continue;
            }
            
            this.console.println("\n" + this.promptMessageWidth);
           String  width = this.getInput();
           if (parseInt (width) == -1){
               finished = true;
               this.console.println("You canceled");
               continue;
           }
           break;
        }
        }catch (Exception e){
            ErrorView.display(this.getClass().getName(), 
                    "Error reading input:" + e.getMessage());
        }
      
       sizeOfArrow soa = new sizeOfArrow();
       soa.calculateArrowSize(Integer.parseInt(length), Integer.parseInt(width));
                 
        return arrowSize;
    }

   @Override 
    public boolean doAction(String length) {
        
        return true;
    }
     
}
		
    
