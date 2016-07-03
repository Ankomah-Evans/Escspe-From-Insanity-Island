/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.exceptions.constructNewSpearException;

/**
 *
 * @author StarrfoxxW8
 */
public class constructNewSpear {
    
	private String promptMessage = "constructNewSpear stub function called";
	public constructNewSpear () {
	}

	public int newSpear(int wood, int stone)
		throws constructNewSpearException {
		
		if (wood < 2 || wood > 2) {
			throw new constructNewSpearException ("You must have 2 pieces of wood to make a shaft for a spear.");
		}
		
		if (stone < 1 || stone > 1) {
			throw new constructNewSpearException ("You must have 1 stone to make a spearhead for a spear");			
		}
		
		int newSpear = (wood + stone) / 3;
		return newSpear;
		
		}    

    void spearParts(int parseInt, int parseInt0) {
        System.out.println("*** spearParts stub function called ***");
    }
    
}
