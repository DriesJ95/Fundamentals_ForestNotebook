package entities.plant_entities;

import entities.plant_entities.enums.LeafType;

public class Tree extends Plant{
    private LeafType leafType;


    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return this.getName() + ", a Tree: " +
                "leaftype: " + leafType + " and a height of " + getHeight() + " m";
    }
}
