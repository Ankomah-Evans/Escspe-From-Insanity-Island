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
    public static int attack(int min, int max, int defense, int health) {
        if (min > max) {return -1;}
        int power = random(min, max);
        
        if (power < 0 || power > 70) {return -1;}
        if (power > (health+defense)) {
            return 0;
        }
        else if (power<defense) {
            return health;
        }
        else {
        health = (defense + health) - power;   

        return health;
        }
    }

    
    public static int random(int min, int max) {
        if (min > max) {return -1;}
        if ((min < 0 || min > 85) || (max < 0 || max > 85)) {return -1;}
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        
        return randomNum;
    }
    public static int useHeal (int health, int itemAmount, int healAmount) {
        if (health < 1 || health > 85) {return -1;}
        if (itemAmount<=0) {return health;}
        else if (health > (85-healAmount) || health > 200) {return health = 85;}
        else { health += healAmount; 
        return health;
    }
    
}
    
        

