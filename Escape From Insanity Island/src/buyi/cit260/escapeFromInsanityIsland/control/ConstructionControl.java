/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.exceptions.constructNewSpearException;
import byui.cit260.escapeFromInsanityIsland.view.View;

/**
 *
 * @author StarrfoxxW8
 */
public class ConstructionControl {

  
    public abstract class ConstructWeaponView extends View {

        public ConstructWeaponView() {
            super("What would you like to construct?");
        }

        public boolean doAction(String wood, String stone) {

            this.setDisplayMessage("Enter the amount of wood and stone to construct a spear.");

            constructNewSpear newspear = new constructNewSpear();
            try {
                newspear.spearParts(Integer.parseInt(wood), Integer.parseInt(stone));
            }
                catch (constructNewSpearException me) {
                    System.out.println(me.getMessage());
                }

            return true;
        }
   
}
    
    
    public void constructNewSpear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void constructNewArrow() {
        System.out.println("*** constructNewArrow stub function called ***");
    }

    public void constructNewShield() {
        System.out.println("*** constructNewShield stub function called ***");
    }

    public void constructNewSowrd() {
        System.out.println("*** constructNewSowrd stub function called ***");
    }
}
