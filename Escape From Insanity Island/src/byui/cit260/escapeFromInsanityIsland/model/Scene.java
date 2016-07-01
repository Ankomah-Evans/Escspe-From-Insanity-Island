/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Scene implements Serializable {
    
    // class instance variable
    private String description;
    private double timeTravelled; 
    private String blockedLocation;
    private String displaySymbol;
    private double noOfItems;
    private Boolean weather;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTimeTravelled() {
        return timeTravelled;
    }

    public void setTimeTravelled(double timeTravelled) {
        this.timeTravelled = timeTravelled;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public double getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(double noOfItems) {
        this.noOfItems = noOfItems;
    }

    public Boolean getWeather() {
        return weather;
    }

    public void setWeather(Boolean weather) {
        this.weather = weather;
    }

    public Scene() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.timeTravelled) ^ (Double.doubleToLongBits(this.timeTravelled) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.blockedLocation);
        hash = 59 * hash + Objects.hashCode(this.displaySymbol);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.noOfItems) ^ (Double.doubleToLongBits(this.noOfItems) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.weather);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.timeTravelled) != Double.doubleToLongBits(other.timeTravelled)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfItems) != Double.doubleToLongBits(other.noOfItems)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", timeTravelled=" + timeTravelled + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + ", noOfItems=" + noOfItems + ", weather=" + weather + '}';
    }

    public void setMapSymbol(String _st_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTravelTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
