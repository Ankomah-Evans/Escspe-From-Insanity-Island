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
public class GameControlException extends Exception {

    public GameControlException() {
    }


public GameControlException(String message) {
        super(message);
    }

    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControlException(Throwable cause) {
        super(cause);
    }

    public GameControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
