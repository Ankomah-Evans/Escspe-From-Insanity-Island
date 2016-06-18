/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import buyi.cit260.escapeFromInsanityIsland.control.ConstructionControl;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ConstructWeaponView extends View {
    
    public ConstructWeaponView() {
        
    super("\n"
            +"\n-----------------------"
            +"\n| Construct Weapon |"
            +"\n-----------------------"
            +"\nS - Spear"
            +"\nA - Arrow"
            +"\nH - Shield"
            +"\nK - Sword"
            +"\nQ - Quit"
            +"\n-----------------------"); 
        
}

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch(value){
            
            case "S":
                this.createSpear();
                break;
                
            case "A":
                this.createArrow();
                break;
                
            case "H":
                this.createShield();
                break;
                
            case "K":
                this.createSword();
                break;
                
            default:
                System.out.println("*** That's an emotion I don't understand. Try another one. ***");
                break;
        }
        return false;
    }

    public void createSpear() {
        ConstructionControl constructionControl = new ConstructionControl();
        constructionControl.spearConstructionControl();
    }

    private void createArrow() {
        ConstructionControl constructionControl = new ConstructionControl();
        constructionControl.arrowConstructionControl();
    }

    private void createShield() {
        ConstructionControl constructionControl = new ConstructionControl();
        constructionControl.shieldConstructionControl();
    }

    private void createSword() {
        ConstructionControl constructionControl = new ConstructionControl();
        constructionControl.swordConstructionControl();
    }
    
}
