package entities.animal_entities;

public class Carnivore extends Animal{

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return this.getName() + "\n A Carnivore which can eat up to " + maxFoodSize + " KGs of meat a day" + "\n"+ " and has a height of " + getHeight() + " m\n";
    }
}
