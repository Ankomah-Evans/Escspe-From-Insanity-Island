/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Resources;

/**
 *
 * @author StarrfoxxW8
 */
public class WorldResources {
    
    private static Resources[] material;
    
   public Resources[] createResourcesList() {
       
       // create list of resource materials
       this.material = new Resources[6];
       
       Resources iron = new Resources("iron");
       this.material [Constants.IRON] = iron;
       
       Resources gold = new Resources("gold");
       this.material [Constants.GOLD] = gold;
       
       Resources stone = new Resources("stone");
       this.material [Constants.STONE] = stone;
       
       Resources wood = new Resources("wood");
       this.material [Constants.WOOD] = wood;
       
       Resources cloth = new Resources("cloth");
       this.material [Constants.CLOTH] = cloth;
       
       Resources leather = new Resources("leather");
       this.material [Constants.LEATHER] = leather;
       
       return material;
   }

    void setDescription(String iron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getRequiredAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
