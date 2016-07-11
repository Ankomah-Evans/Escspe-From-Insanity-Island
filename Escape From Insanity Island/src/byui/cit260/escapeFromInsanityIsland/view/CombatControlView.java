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
public class CombatControlView extends View {

    public CombatControlView() {
		
            super("\nYou have entered a battle!"
                 +"\n----------------------------"
                 +"\n|      Combat Menu         |"
                 +"\n----------------------------"
                 +"\nA - Attact"
                 +"\nH - Heal"
                 +"\nF - Flee"
                 +"\nQ - quit"
                 +"\n----------------------------");
    }
    
    @Override

    public boolean doAction (String value){
		value = value.toUpperCase();
                
        switch (value){
            case "A": 
                this.attack();
                break;
            case "H":
                this.heal();
                break;
            case "F":
                this.flee();
                break;  
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;     
    }

    private void attack() {
        System.out.println("\n*** You attack! ***");
    }

    private void heal() {
        System.out.println("\n*** You heal thyself. ***");
    }

    private void flee() {
        System.out.println("\n*** You flee like a coward! ***");
    }
}