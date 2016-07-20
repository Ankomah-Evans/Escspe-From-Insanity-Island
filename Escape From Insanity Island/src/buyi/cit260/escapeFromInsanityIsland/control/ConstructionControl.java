/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.exceptions.constructNewSpearException;
import byui.cit260.escapeFromInsanityIsland.view.View;
import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author StarrfoxxW8
 */
public class ConstructionControl {
    
    private PrintWriter console;
    
        public void ConstructionControl() {
            this.console = EscapeFromInsanityIsland.getOutFile();
        }

  
    public abstract class ConstructWeaponView extends View {

        public ConstructWeaponView() {
            super("What would you like to construct?");
        }

        public boolean doAction(String wood, String stone) {

            this.setDisplayMessage("Enter the amount of wood and stone to construct a spear.");

            constructNewSpear newspear = new constructNewSpear();
            newspear.spearParts(Integer.parseInt(wood), Integer.parseInt(stone));

            return true;
        }
   
    }
    
    private long getMaterials(String[] materials) {
        
        long total = 0; // initialize total to zero
        
        // navigate a one dimensional array using a for loop with an index
        
        for (int i=0; i < materials.length; i++) {
            total += Long.parseLong(materials[i]);
        }
        return total;
    }
    
    
    public void constructNewSpear() {
        this.console.println("*** constructNewSpear stub function called ***");
    }
    
    
    public void constructNewArrow() {
        this.console.println("*** constructNewArrow stub function called ***");
    }

    public void constructNewShield() {
        this.console.println("*** constructNewShield stub function called ***");
    }

    public void constructNewSowrd() {
        this.console.println("*** constructNewSowrd stub function called ***");
    }
}
