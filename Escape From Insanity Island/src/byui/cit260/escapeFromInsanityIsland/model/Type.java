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
public class Type implements Serializable{
    
    // class instance variable
    private String wood;
    private String iron;
    private String animalPelt;

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getIron() {
        return iron;
    }

    public void setIron(String iron) {
        this.iron = iron;
    }

    public String getAnimalPelt() {
        return animalPelt;
    }

    public void setAnimalPelt(String animalPelt) {
        this.animalPelt = animalPelt;
    }

    public Type() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.wood);
        hash = 61 * hash + Objects.hashCode(this.iron);
        hash = 61 * hash + Objects.hashCode(this.animalPelt);
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
        final Type other = (Type) obj;
        if (!Objects.equals(this.wood, other.wood)) {
            return false;
        }
        if (!Objects.equals(this.iron, other.iron)) {
            return false;
        }
        if (!Objects.equals(this.animalPelt, other.animalPelt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Type{" + "wood=" + wood + ", iron=" + iron + ", animalPelt=" + animalPelt + '}';
    }
    
      
}
