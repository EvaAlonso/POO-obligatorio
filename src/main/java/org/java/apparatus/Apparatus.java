package org.java.apparatus;

import org.java.historyCharacter.HistoryCharacter;

public abstract class Apparatus extends HistoryCharacter {
    private String power;
    private int powerIntensity;
    public Apparatus(String name, String description, String power, int powerIntensity ){
        super(name, description);
        this.power = power;
        this.powerIntensity = powerIntensity;
    }
}
