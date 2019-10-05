package entities.plant_entities;

import entities.plant_entities.enums.LeafType;

public class Bush extends Plant{
    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit(){
        return fruit;
    }

    public void setFruit(String fruit){
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return this.getName() + ", a Bush with fruit: " + fruit + " and leaftype: " + leafType + " and a height of " + getHeight() + " m";
    }
}
