// Dogs, Cats, Hamsters

import java.util.HashMap;
import java.util.Map;

public class Pets extends Animals {
    private Map<String, Integer> pets;
    private long id;
    private String description;
    private long animalId;
    private String animalDescription;
    
    
    public Pets(long id, String description, long animalId, String animalDescription) {
        super(animalId, animalDescription);
        this.id = id;
        this.description = description;
    }

public Map<String, Integer> insertPet(String description, int animalId) {
    pets.put(description, animalId);
    return pets;
}
}