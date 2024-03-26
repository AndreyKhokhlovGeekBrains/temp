// Pets, PackAnimals

import java.util.HashMap;
import java.util.Map;


public class Animal {
    private int animalId;
    private String description;
    private List<Animal> animals
    Map<String, Integer> animals;

public Animal() {
    this.animals = new HashMap<String, Integer>();
}

public Map<String, Integer> insertAnimal(String description, int value) {
    animals.put(description, value);
    return animals;
}

private int getMaxId() {

}
