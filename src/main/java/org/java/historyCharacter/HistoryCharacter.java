package org.java.historyCharacter;

public abstract class HistoryCharacter {
    private String name;
    private String description;

    public HistoryCharacter(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String greeting(){
        return "Hola me llamo " + this.name + " y soy " + this.description;
    };
}
