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
public enum Character implements Serializable {
    
    Jack("Is a middle aged man, energetic and very smart."),
    Jessie("Is a boy, 15 years old and has great analytical abilities"),
    Emily("Is a girl, 17 years old and is very shy but smart"),
    Ruth("Is a mother of 4 kids and is a wildlife scientist");
    
    // class instance variable
    private final String description;
    private final String type;
    private final String mood;

   Character(String description) {
            this.description = description;
            type = new String ();
            mood = new String ();
    }
    
    


    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getMood() {
        return mood;
    }


    @Override
    public String toString() {
        return "Character{" + "description=" + description + ", type=" + type + ", mood=" + mood + '}';
    }
    
}
