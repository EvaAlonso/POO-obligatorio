package org.java.creature;

import org.java.historyCharacter.HistoryCharacter;

public abstract class Creature extends HistoryCharacter {

    private String place;
    private boolean kindness;

    public Creature(String name, String description, String place, boolean kindness){
        super(name, description );
        this.place = place;
        this.kindness = kindness;
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
