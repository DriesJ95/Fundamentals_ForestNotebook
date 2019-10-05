package service;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNotebook {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal){
        animalCount++;
        animals.add(animal);
        if (animal instanceof Carnivore){
            carnivores.add((Carnivore) animal);
        }else if (animal instanceof Omnivore){
            omnivores.add((Omnivore)animal);
        }else if (animal instanceof Herbivore){
            herbivores.add((Herbivore)animal);
        }
    }

    public void addPlant(Plant plant){
        plants.add(plant);
        plantCount++;
    }

    public void printNotebook(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("My Forest Notebook");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("ANIMAL KINGDOM ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("CARNIVOROUS BEASTS");
        System.out.println("--------------------------------------------------------------------------------");
        carnivores.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("OMNIVOROUS BEASTS");
        System.out.println("--------------------------------------------------------------------------------");
        omnivores.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("HERBIVOROUS BEASTS");
        System.out.println("--------------------------------------------------------------------------------");
        herbivores.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("PLANTS");
        System.out.println("--------------------------------------------------------------------------------");
        plants.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("COMPENDIUM CREATED BY D. JONCHEERE");
    }

    public void sortAnimalsByName(){
        animals = animals.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        carnivores = carnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        herbivores = herbivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        omnivores = omnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
    }

    public void sortPlantsByName(){
        plants = plants.stream().sorted(Comparator.comparing(Plant::getName)).collect(Collectors.toList());
    }

    public void sortAnimalsByHeight(){
        animals = animals.stream().sorted(Comparator.comparing(Animal::getHeight)).collect(Collectors.toList());
    }

    public void sortPlantsByHeight(){
        plants = plants.stream().sorted(Comparator.comparing(Plant::getHeight)).collect(Collectors.toList());
    }

    public void printAnimals(){
        animals.forEach(System.out::println);
    }

    public void printPlants(){
        plants.forEach(System.out::println);
    }
}
