/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.insanity.island;

import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @ankomah
 */
public class EscapeFromInsanityIsland {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        EscapeFromInsanityIsland.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        EscapeFromInsanityIsland.inFile = inFile;
    }
    private static BufferedReader inFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EscapeFromInsanityIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EscapeFromInsanityIsland.player = player;
    }
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        EscapeFromInsanityIsland.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
        
        // open character stream files for end user input and output
        EscapeFromInsanityIsland.inFile =
                new BufferedReader(new InputStreamReader(System.in));
        EscapeFromInsanityIsland.outFile = new PrintWriter(System.out, true);
        
        // open log file
        String filePath = "log.txt";
        EscapeFromInsanityIsland.logFile = new PrintWriter(filePath);
        } catch (Exception e){
            System.out.println("Exception: " + e.toString()+
                               "\nCause: " + e.getCause()+
                               "\nMessage: " + e.getMessage());
        }
        
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
    } catch (Throwable e) {
    
            System.out.println("Exception: " + e.toString()+
                              "nCause: " + e.getCause()+
                              "nMessage: " + e.getMessage());
            
            e.printStackTrace();;
    }
              
    finally {
            try {
                if (EscapeFromInsanityIsland.inFile != null)
                    EscapeFromInsanityIsland.inFile.close();
                if (EscapeFromInsanityIsland.outFile != null)
                    EscapeFromInsanityIsland.outFile.close();
                if (EscapeFromInsanityIsland.logFile != null)
                    EscapeFromInsanityIsland.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
            }
       }
}    

