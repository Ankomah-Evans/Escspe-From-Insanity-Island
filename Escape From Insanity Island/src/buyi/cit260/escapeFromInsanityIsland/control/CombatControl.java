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
    
    public static int attack(int strength , int defense) {
        if (strength < 5 || strength > 20) {
            return -1;
        }
        
        if (defense <5) {
            return -1;
        }
        
        int healthReturned = strength * defense;
        
        return healthReturned; 
    }


    public static int random(int min, int max) {
        if (min > max) {
                return -1;
        }
        if ((min < 0 || min > 85) || (max < 0 || max > 85)) {
                return -1;
        }
        
        Random rand = new Random();
        
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    
    public static int useHeal (int health, int itemAmount, int healAmount) {
        if (health < 1 || health > 85) {
                return -1;
        }        
        if (itemAmount <= 0) {
                return health;
        }
        else if (health > (85 - healAmount) || health > 200) {
                return health;
        }
        else {
            health += healAmount;
        return health;
        }
    }
        
    
    public static int flee (int min, int max, int defense, int chance) {
        if (min > max) {
                return -1;
        }
        int escape = random(min, max);
        
        if (escape < 0 || escape > 70) {
                return -1;
        }
        if (escape > (chance + defense)) {
            return 0;
        }
        else if (escape < defense) {
            return chance;
        }
        else {
            chance = (defense + chance) - escape;
            return chance;
        }
    }       
    
}
