package forestbook_app;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;
import entities.plant_entities.enums.LeafType;
import entities.plant_entities.enums.Scent;
import service.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class ForestBookApp {
    public static void main(String[] args) {
        ForestNotebook compendium = new ForestNotebook();

        //PLANTS
        Plant plant1 = new Tree("Oak Tree",37.5);
        ((Tree) plant1).setLeafType(LeafType.HAND);
        Plant plant2 = new Flower("Lilly",0.34);
        ((Flower) plant2).setSmell(Scent.SWEET);
        Plant plant3 = new Weed("Grain",1.90);
        ((Weed) plant3).setArea(84);
        Plant plant4 = new Bush("Blueberry bush",1.60);
        ((Bush) plant4).setFruit("Blueberries");
        ((Bush) plant4).setLeafType(LeafType.SPEAR);
        Plant plant5 = new Bush("Blackberry bush",2.80);
        ((Bush) plant5).setFruit("Blackberries");
        ((Bush) plant5).setLeafType(LeafType.SPEAR);
        Plant plant6 = new Flower("Eucalypt",10);
        ((Flower) plant6).setSmell(Scent.MUSKY);
        compendium.addPlant(plant1);compendium.addPlant(plant2);compendium.addPlant(plant3);
        compendium.addPlant(plant4);compendium.addPlant(plant5);compendium.addPlant(plant6);


        //ANIMALS
        //Carnivores
        Animal animal1 = new Carnivore("Tiger",280,1.30,2.10);
        ((Carnivore) animal1).setMaxFoodSize(500);
        Animal animal2 = new Carnivore("Lion",450,1.45,2.30);
        ((Carnivore) animal2).setMaxFoodSize(1000);
        Animal animal3 = new Carnivore("C(h)annibal",80,1.80,0.38);
        ((Carnivore) animal3).setMaxFoodSize(85);

        //Herbivores
        Set<Plant> plantDiet = new LinkedHashSet<>();
        plantDiet.add(plant2);plantDiet.add(plant3);plantDiet.add(plant4);plantDiet.add(plant5);

        Animal animal4 = new Herbivore("Giraffe",950,4.50,2.40);
        ((Herbivore) animal4).setPlantDiet(plantDiet);
        Animal animal5 = new Herbivore("Brachiosaurus",64000,9.50,21);
        ((Herbivore) animal5).setPlantDiet(plantDiet);
        Animal animal6 = new Herbivore("Koala",9,0.50,0.85);
        //Cause we love Koalas
        ((Herbivore) animal6).setPlantDiet(plantDiet);
        ((Herbivore) animal6).addPlantToDiet(plant6);

        //Omnivores
        Animal animal7 = new Omnivore("Human",70,1.70,0.35);
        ((Omnivore) animal7).setMaxFoodSize(1.5);
        ((Omnivore) animal7).setPlantDiet(plantDiet);
        Animal animal8 = new Omnivore("Pig",300,0.9,1.4);
        ((Omnivore) animal8).setMaxFoodSize(20);
        ((Omnivore) animal8).setPlantDiet(plantDiet);
        Animal animal9 = new Omnivore("Turtle",120,0.50,0.80);
        ((Omnivore) animal9).setMaxFoodSize(10);
        ((Omnivore) animal9).setPlantDiet(plantDiet);
        compendium.addAnimal(animal1);compendium.addAnimal(animal2);compendium.addAnimal(animal3);
        compendium.addAnimal(animal4);compendium.addAnimal(animal5);compendium.addAnimal(animal6);
        compendium.addAnimal(animal7);compendium.addAnimal(animal8);compendium.addAnimal(animal9);


        //Output
        System.out.println("The number of plants I encountered was " + compendium.getPlantCount());
        System.out.println("The number of animals I encoutered was " + compendium.getAnimalCount());

        compendium.printNotebook();

        System.out.println("Solely the carnivores: \n " + compendium.getCarnivores());
        System.out.println("Solely the omnivores: \n " + compendium.getOmnivores());
        System.out.println("Solely the herbivores: \n " + compendium.getHerbivores());

        compendium.sortPlantsByName();
        compendium.sortAnimalsByName();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("REPRINTING NOTEBOOK NOW THAT IT IS ALPHABETICALLY SORTED");
        System.out.println("--------------------------------------------------------------------------------");
        compendium.printNotebook();


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("REPRINTING ANIMALS AND PLANTS NOW THAT THEY ARE SORTED BY HEIGHT");
        System.out.println("--------------------------------------------------------------------------------");
        //aparte print methodes geschreven voor animals & plants hiervoor, printnotebook gebruikt carnivores/herbivores/omnivores
        //etc om te printen. ik zou ook de sortAnimals en plants methodes kunnen herschrijven om de notebook zo te sorteren
        //maar dit lijkt onlogisch, een compendium is altijd alfabetisch en dus bij deze een output hieronder gesorteerd
        //naar hoogte
        compendium.sortAnimalsByHeight();
        compendium.sortPlantsByHeight();


        System.out.println("Animals sorted by height:\n");
        compendium.printAnimals();
        System.out.println("Plants sorted by height: \n");
        compendium.printPlants();



        //
    }
}
