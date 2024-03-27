import java.util.HashMap;
import java.util.Map;

public class PackAnimals {
    private Map<Integer, String> packAnimals = new HashMap<>();
    private Integer id;
    private String description;
    private Integer animalId;
    private String animalDescription;
    private static final String petType = "PackAnimals";

    public PackAnimals() {

        packAnimals.put(1, "Horses");
        packAnimals.put(2, "Camels");
        packAnimals.put(3, "Donkeys");
    }

// *** *** ***

public String printPackAnimalTypes(){
    StringBuilder sb = new StringBuilder();
    sb.append("Pack animals: \n");
        for (Map.Entry<Integer, String> entry : packAnimals.entrySet()) {
            Animals animals = new Animals(petType);
            sb.append("id: ").append(entry.getKey()).append(", description: ").append(entry.getValue()).append(", ")
            .append("animalId: ").append(animals.getID(petType)).append(", description: ").append(animals.getDescription()).append("\n");
        }
    return sb.toString();
}

public String printPackAnimalsByID(Integer id) {
    StringBuilder sb = new StringBuilder();
    sb.append("Pack animals: \n");
        
    Animals animals = new Animals(petType);

    sb.append("id: ").append(id).append(", description: ").append(packAnimals.get(id)).append(", ")
    .append("animalId: ").append(animals.getID(petType)).append(", description: ").append(animals.getDescription()).append("\n");
        
    return sb.toString();
}

public void addNewPackAnimalType(String description) {
    int maxKey = -1;
    for(int key: packAnimals.keySet()) {
        if (key > maxKey) {
            maxKey = key;
        }
    }
    packAnimals.put(maxKey + 1, description);
}

public void removePackAnimalType(String description) {
    Integer keyToRemove = null;
    for(Map.Entry<Integer, String> entry : packAnimals.entrySet()) {
        if(entry.getValue().equals(description)) {
            keyToRemove = entry.getKey();
            break;
        }
    }

    if(keyToRemove == null) {
        throw new IllegalArgumentException("There is no specified pack animal type");
    } else {
        packAnimals.remove(keyToRemove);
    }
}

public Integer getID(String description) {
    int id = -1;
    for(Map.Entry<Integer, String> entry : packAnimals.entrySet()) {
        if(entry.getValue().equals(description)) {
            id = entry.getKey();
            break;
        }
    }
    return id;
}
}
