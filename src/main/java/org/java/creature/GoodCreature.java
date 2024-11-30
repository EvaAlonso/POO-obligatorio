package org.java.creature;
import org.java.interfaces.acction;

public class GoodCreature extends Creature implements acction{

    public GoodCreature(String name, String description, String place, boolean kidness){
        super(name, description, place, true);
    }
    public int attack(){
        return +1;
    }
    public String sentence(){
        return "Gracias por ser amable conmigo te doy una vida";
    }
}
