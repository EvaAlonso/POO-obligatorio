package org.java.human;

import org.java.historyCharacter.HistoryCharacter;

public class Human extends HistoryCharacter {
    private String rol;

    public Human(String name, String description, String rol){
        super(name, description);
        this.rol = rol;
    }
    public String sayRol(){
        return this.rol;
    }
}
