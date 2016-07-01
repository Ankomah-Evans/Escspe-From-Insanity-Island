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
public class Item implements Serializable {
    
    // class instance variable
    private String name;
    private String description;
    private String damage;
    private String protection;
    private String healing;
    private String create;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getHealing() {
        return healing;
    }

    public void setHealing(String healing) {
        this.healing = healing;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public Item() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.damage);
        hash = 67 * hash + Objects.hashCode(this.protection);
        hash = 67 * hash + Objects.hashCode(this.healing);
        hash = 67 * hash + Objects.hashCode(this.create);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.damage, other.damage)) {
            return false;
        }
        if (!Objects.equals(this.protection, other.protection)) {
            return false;
        }
        if (!Objects.equals(this.healing, other.healing)) {
            return false;
        }
        if (!Objects.equals(this.create, other.create)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + ", damage=" + damage + ", protection=" + protection + ", healing=" + healing + ", create=" + create + '}';
    }

    public Object getRequiredAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
