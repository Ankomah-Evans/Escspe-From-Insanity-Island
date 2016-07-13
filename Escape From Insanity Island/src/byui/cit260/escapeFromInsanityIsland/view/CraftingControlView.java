/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

/**
 *
 * @author StarrfoxxW8
 */
class CraftingControlView extends View{

    public void display() {
        this.console.println("\n*** display() function called ***");
    }

    void displayConstructionMenuView() {
        this.console.println("\n*** displayConstructionMenuView() function called ***");
    }

    @Override
    public boolean doAction(String value) {
        this.console.println("\n*** doAction stub function called***");
        return true;
    }
    
}
