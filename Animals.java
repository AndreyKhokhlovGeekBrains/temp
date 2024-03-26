// Pets, PackAnimals

import java.util.HashMap;
import java.util.Map;


public class Animals {
    private long animalId;
    private String description;
    Map<Integer, String> animals;

public Animals(long animalId, String description) {
    this.animalId = animalId;
    this.description = description;
}

public Map<Integer, String> animals(int animalId, String description) {
    animals.put(1, "Pets");
    animals.put(2, "PackAnimals");
    return animals;
}

}
