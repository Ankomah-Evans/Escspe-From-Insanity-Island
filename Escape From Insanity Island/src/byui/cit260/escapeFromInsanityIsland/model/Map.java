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
public class Map implements Serializable {
    
    // class instance variable
    private Boolean rowCount;
    private Boolean columnCount;  

    public Boolean getRowCount() {
        return rowCount;
    }

    public void setRowCount(Boolean rowCount) {
        this.rowCount = rowCount;
    }

    public Boolean getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Boolean columnCount) {
        this.columnCount = columnCount;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.rowCount);
        hash = 41 * hash + Objects.hashCode(this.columnCount);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
}
