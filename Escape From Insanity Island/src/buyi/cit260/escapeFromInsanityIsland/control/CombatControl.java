/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import java.util.Random;

/**
 *
 * @author user
 */
public class CombatControl {
    public int attackMob (int weapon, int damage, int defense, int health) {
        if (weapon < 5 || weapon > 20) { // weapon strength added to damage
            return -1;
        }
        if (damage < 0 || damage > 36) { // amount of damage
            return -1;
        }
        if (defense < 0 || defense > 20) { // amount of defense to subtract from damage and strength
            return -1;
        }
        if (health < 0 || health > 100) { // amount of health of a mob
            return -1;
        }
        
        int newHealth = health - ((damage + weapon) - defense);
        return newHealth;
    }     
}