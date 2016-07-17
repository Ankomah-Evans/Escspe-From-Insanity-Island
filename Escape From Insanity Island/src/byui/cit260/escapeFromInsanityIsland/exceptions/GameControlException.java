/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.exceptions;

import escape.from.insanity.island.EscapeFromInsanityIsland;
import java.io.PrintWriter;

/**
 *
 * @author StarrfoxxW8
 */
public class GameControlException {
    
    private PrintWriter console;
    
        public void GameControlException() {
            this.console = EscapeFromInsanityIsland.getOutFile();
        }
    
}
