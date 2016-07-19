/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.escapeFromInsanityIsland.control;

/**
 *
 * @author StarrfoxxW8
 */
public class WorldResources {
    
   private static materials[] createMaterialList() {
       
       // create list of resource materials
       Material[] materials = new Material[Constants.NUMBER_OF_MATERIALS];
       
       Material iron = new Material("iron");
       materials[Constants.IRON] = iron;
       
       Material gold = new Material("gold");
       materials[Constants.GOLD] = gold;
       
       Material stone = new Material("stone");
       materials[Constants.STONE] = stone;
       
       Material wood = new Material("wood");
       materials[Constants.WOOD] = wood;
       
       Material cloth = new Material("cloth");
       materials[Constants.CLOTH] = cloth;
       
       Material leather = new Material("leather");
       materials[Constants.LEATHER] = leather;
       
       return materials;
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
