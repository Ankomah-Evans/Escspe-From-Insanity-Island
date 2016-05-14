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
public class Danger implements Serializable {
    
    // class instance variable
    private String trap;
    private String mob;
    private String description;

    public String getTrap() {
        return trap;
    }

    public void setTrap(String trap) {
        this.trap = trap;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Danger() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.trap);
        hash = 89 * hash + Objects.hashCode(this.mob);
        hash = 89 * hash + Objects.hashCode(this.description);
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
        final Danger other = (Danger) obj;
        if (!Objects.equals(this.trap, other.trap)) {
            return false;
        }
        if (!Objects.equals(this.mob, other.mob)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Danger{" + "trap=" + trap + ", mob=" + mob + ", description=" + description + '}';
    }
    
    
}
