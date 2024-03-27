// Pets, PackAnimals

import java.util.HashMap;
import java.util.Map;


public class Animals {
    private Integer animalId;
    private String description;
    private Map<Integer, String> animals = new HashMap<>();

public Animals(Integer animalId) {
    animals.put(1, "Pets");
    animals.put(2, "PackAnimals");
    
    this.animalId = animalId;
    this.description = animals.get(animalId);
}

public Animals(String description) {
    animals.put(1, "Pets");
    animals.put(2, "PackAnimals");
    
    this.animalId = getID(description);
    this.description = description;
}

public String printAnimalTypes(){
    StringBuilder sb = new StringBuilder();
    sb.append("Animals: \n");
        for (Map.Entry<Integer, String> entry : animals.entrySet()) {
            sb.append("id: ").append(entry.getKey()).append(", description: ").append(entry.getValue()).append("\n");
        }
    return sb.toString();
}

public void addNewAnimalType(String description) {
    int maxKey = -1;
    for(int key: animals.keySet()) {
        if (key > maxKey) {
            maxKey = key;
        }
    }
    animals.put(maxKey + 1, description);
}

public void removeAnimalType(String description) {
    int keyToRemove = -1;
    for(int key: animals.keySet()) {
        if(animals.get(key).equals(description)) {
            keyToRemove = key;
        }
    }

    if(keyToRemove == -1) {
        System.out.println("There is no specified animal type");
    } else {
        animals.remove(keyToRemove);
    }   
}

public Integer getID(String description) {
    int id = -1;
    for(Map.Entry<Integer, String> entry: animals.entrySet()) {
        if(entry.getValue().equals(description)) {
            id = entry.getKey();
            break;
        }
    }
    return id;
}

public String getDescription() {
    return description;
}

}
