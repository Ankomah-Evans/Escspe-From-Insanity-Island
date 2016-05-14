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
public class Ground implements Serializable {
    
    // class instance variable
    private String footPatterns;
    private String bentFoliage;
    private String description;

    public String getFootPatterns() {
        return footPatterns;
    }

    public void setFootPatterns(String footPatterns) {
        this.footPatterns = footPatterns;
    }

    public String getBentFoliage() {
        return bentFoliage;
    }

    public void setBentFoliage(String bentFoliage) {
        this.bentFoliage = bentFoliage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ground() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.footPatterns);
        hash = 79 * hash + Objects.hashCode(this.bentFoliage);
        hash = 79 * hash + Objects.hashCode(this.description);
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
        final Ground other = (Ground) obj;
        if (!Objects.equals(this.footPatterns, other.footPatterns)) {
            return false;
        }
        if (!Objects.equals(this.bentFoliage, other.bentFoliage)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ground{" + "footPatterns=" + footPatterns + ", bentFoliage=" + bentFoliage + ", description=" + description + '}';
    }
    
    
}
