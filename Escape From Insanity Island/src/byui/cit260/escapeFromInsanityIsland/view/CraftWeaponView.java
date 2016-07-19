/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.exceptions.makeNewSwordException;

/**
 *
 * @author StarrfoxxW8
 */

public class CraftWeaponView extends View{
    
	private String promptMessage = "craftWeaponView stub function called";
	public CraftWeaponView () {
	}

	public int newSword (int wood, int iron)
		throws makeNewSwordException {
		
		if (wood < 1 || wood > 1) {
			throw new makeNewSwordException ("You must have 1 piece of wood to make a handle for a sword.");
		}
		
		if (iron < 3 || iron > 3) {
			throw new makeNewSwordException ("You must have 3 iron to make a blade for a sword");			
		}
		
		int newSword = (wood + iron) / 4;
		return newSword;
		
		}      

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
