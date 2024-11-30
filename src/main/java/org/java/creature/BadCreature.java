package org.java.creature;

import org.java.interfaces.acction;

public class BadCreature extends Creature implements acction {

    public BadCreature(String name, String description, String place, boolean kidness){
        super(name, description, place, false);
    }
    public int attack(){
        return -1;
    }
    public String sentence(){
        return "Eres peor que yo te ataco y te quito una vida";
    }
}
