// Dogs, Cats, Hamsters

import java.util.HashMap;
import java.util.Map;

public class Pets {
    private Map<String, Integer> pets;
    
public Pets() {
    this.pets = new HashMap<String, Integer>();
}

public Map<String, Integer> insertPet(String description, int animalId) {
    pets.put(description, animalId);
    return pets;
}
}