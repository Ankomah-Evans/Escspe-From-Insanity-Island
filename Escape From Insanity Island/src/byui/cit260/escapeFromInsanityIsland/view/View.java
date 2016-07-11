/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.GameControl;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author StarrfoxxW8
 */
public abstract class View implements ViewInterface {
    
    private String message;
    
    protected final BufferedReader keyboard = EscapeFromInsanityIsland.getInFile();
    protected final PrintWriter console = EscapeFromInsanityIsland.getOutFile();
    
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        
        boolean done = false;
        do {
           // prompt for and get players name
           String value = this.getInput();
           if (value.toUpperCase().equals("Q")) // user wants to quit
               return; // exit the view

           // do the requested action and display the next view
           done = this.doAction(value);

        } while (!done); // exit the view when donw == true
    }
    
    @Override
    public String getInput() {
        
        
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        while (!valid) {
            
            // prompt for the player's name
            this.console.println("\n" + this.displayMessage);
            
            try {
                // get the value entered from the keyboard
                value = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();
            
            if (value.length() < 1) { // blank value entered
                ErrorView.display(this.getClass().getName(),"\n*** You must enter a value *** ");
                continue;
                
            }
            
            break;
        }
        
        return value; //return the name
    }
    public void setDisplayMessage(String message) {
        this.displayMessage = message;
    }
    
}