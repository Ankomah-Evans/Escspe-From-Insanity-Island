/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;
import byui.cit260.escapeFromInsanityIsland.exceptions.CombatControlException;

/**
 *
 * @author StarrfoxxW8
 */
public class CombatControl {
        public int attackMob (int weapon, int damage, int defense, int health) 
                    throws CombatControlException {
                       
            
        if (weapon < 5 || weapon > 20) { // weapon strength added to damage
            throw new CombatControlException("Can not attack because the weapon is "
                                           + "either too weak or strong than allowed.");
        }
        if (damage < 0 || damage > 36) { // amount of damage
            throw new CombatControlException("Damage must be within the constraints "
                                           + "of the program.");
        }
        if (defense < 0 || defense > 20) { // amount of defense to subtract from damage and strength
            throw new CombatControlException("Defense must be within the constraints "
                                           + "of the program.");
        }
        if (health < 0 || health > 100) { // amount of health of a mob
            throw new CombatControlException("Mob health cannot be under 0 or over 100.");
        }
        
        int newHealth = health - ((damage + weapon) - defense);
        return newHealth;
    }   
	
        public int selfHeal (int bandage, int health, int healAmt) 
                            throws CombatControlException {
            
        if (bandage < 1 || bandage > 20) { // amount of bandages (stack of 20 is the max)
            throw new CombatControlException("Bandage strength must be within"
                                           + "the constraints of the program.");
        }
        if (health < 1 || health > 85) { // the current health of the player
            throw new CombatControlException("Player health cannot be less than 1"
                                           + "or greater than 85.");
        }
        if (healAmt < 1 || healAmt > 15) { // amount of healing of the player
            throw new CombatControlException("Amount healed cannot be less than 1"
                                           + "or greater than 15.");
        }
        
        int healedHealth = health + healAmt;
        return healedHealth;
    }  
}
