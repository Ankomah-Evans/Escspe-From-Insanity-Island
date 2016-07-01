/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import buyi.cit260.escapeFromInsanityIsland.control.Player;
import byui.cit260.escapeFromInsanityIsland.view.GameMenuView;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Game implements Serializable {
    
    // class instance variable
    private double totalTime;
    private double noPeople;
    
    private Character character;
    private Boat boat;
    private Map map;
    
    private Location[] locations = new Location[5];
    private Item[] items = new Item[19];
    private ArrayList<Resource> resources = new ArrayList<>();

    public Game() {
    }
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

    public void setCharacter(Character character) {
        System.out.println("*** setCharacter() function called in GameControl ***");
    }

    public void setMap(Map map) {
        System.out.println("*** setMap() function called in GameControl ***");
    }

    public void setPlayer(Player player) {
        System.out.println("*** setPlayer() function called in GameControl ***");
    }

    public void setInventory(Item[] inventoryList) {
        System.out.println("*** setInventory() function called in GameControl ***");
    }

    public void setMap(buyi.cit260.escapeFromInsanityIsland.control.Map map) {
        System.out.println("*** setMap() function called in GameControl ***");
    }

    public GameMenuView.InventoryItem[] getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location[] getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
