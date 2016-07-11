/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;
import java.util.Scanner;

/**
 *
 * @author StarrfoxxW8
 */
public class ConstructionMenuView extends View {

    public ConstructionMenuView() {
		
                super("\n---------------------------------------"
                    + "\n|          Construction Menu          |"
                    + "\n---------------------------------------"
                    + "\n|                                     |"
                    + "\n| T - Craft Tool                      |"
                    + "\n| W - Craft Weapon                    |"
                    + "\n| A - Craft Armor                     |"
                    + "\n| I - Craft Items                     |"
                    + "\n| X - Exit Menu                       |"
                    + "\n|                                     |"							
                    + "\n---------------------------------------");
    }
    
    @Override
    public boolean doAction (String value){		
		value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "T": 
                this.startCraftTool();
                break;
            case "W":
                this.startCraftWeapon();
                break;
            case "A":
                this.startCraftArmor();
                break;
            case "I":
                this.startCraftItem();
                break;
            case "X":
                this.exitMenu();
                break;				
            default:
                ErrorView.display(this.getClass().getName(),"\n*** What option is that? Try again, bud.");
                break;
        }
        return false;       
    }
	
    // display the construction menu

    private void startCraftTool() {
		this.console.println("\n*** startCraftTool() called ***");		
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

    private void startCraftWeapon() {
		this.console.println("\n*** startCraftWeapon() called ***");			
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

    private void startCraftArmor() {
		this.console.println("\n*** startCraftArmor() called ***");			
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

    private void startCraftItem() {
		this.console.println("\n*** startCraftItem() called ***");			
		
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }
	
    private void exitMenu() {
				
        CraftingControlView craftingControl = new CraftingControlView();
        craftingControl.display();
    }

}