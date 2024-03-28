// Dogs, Cats, Hamsters

import java.util.HashMap;
import java.util.Map;

public class Pets {
    private Map<Integer, String> pets = new HashMap<>();
    private Integer id;
    private String description;
    private Integer animalId;
    private String animalDescription;
    private static final String petType = "Pets";

    public Pets() {

        pets.put(1, "Dogs");
        pets.put(2, "Cats");
        pets.put(3, "Hamsters");
    }

// *** *** ***

public String printPetTypes(){
    StringBuilder sb = new StringBuilder();
    sb.append("Pets: \n");
        for (Map.Entry<Integer, String> entry : pets.entrySet()) {
            Animals animals = new Animals(petType);
            sb.append("id: ").append(entry.getKey()).append(", description: ").append(entry.getValue()).append(", ")
            .append("animalId: ").append(animals.getID(petType)).append(", description: ").append(animals.getDescription()).append("\n");
        }
    return sb.toString();
}

public String printPetsByID(Integer id) {
    StringBuilder sb = new StringBuilder();
    sb.append("Pets: \n");
        
    Animals animals = new Animals(petType);

    sb.append("id: ").append(id).append(", description: ").append(pets.get(id)).append(", ")
    .append("animalId: ").append(animals.getID(petType)).append(", description: ").append(animals.getDescription()).append("\n");
        
    return sb.toString();
}

public void addNewPetType(String description) {
    int maxKey = -1;
    for(int key: pets.keySet()) {
        if (key > maxKey) {
            maxKey = key;
        }
    }
    pets.put(maxKey + 1, description);
}

public void removePetType(String description) {
    Integer keyToRemove = null;
    for(Map.Entry<Integer, String> entry : pets.entrySet()) {
        if(entry.getValue().equals(description)) {
            keyToRemove = entry.getKey();
            break;
        }
    }

    if(keyToRemove == null) {
        throw new IllegalArgumentException("There is no specified pet type");
    } else {
        pets.remove(keyToRemove);
    }
}

public Integer getID(String description) {
    int id = -1;
    for(Map.Entry<Integer, String> entry : pets.entrySet()) {
        if(entry.getValue().equals(description)) {
            id = entry.getKey();
            break;
        }
    }
    return id;
}

public String getDescriptionByID(Integer id) {
    return pets.get(id);
}

public Map<Integer, String> getPetsList() {
    return pets;
}

public String getPetType () {
    return petType;
}

}