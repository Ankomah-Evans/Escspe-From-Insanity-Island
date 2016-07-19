/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.exceptions.makeNewHammerException;

/**
 *
 * @author StarrfoxxW8
 */
public class CraftToolView extends View{
    
	private String promptMessage = "craftTool stub function called";
	public CraftToolView () {
	}

	public int newHammer (int wood, int stone)
		throws makeNewHammerException {
		
		if (wood < 2 || wood > 2) {
			throw new makeNewHammerException ("You must have 2 pieces of wood to make a hilt for a hammer.");
		}
		
		if (stone < 2 || stone > 2) {
			throw new makeNewHammerException ("You must have 2 stone to make a head for a hammer");			
		}
		
		int newHammer = (wood + stone) / 4;
		return newHammer;
		
		}      

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
