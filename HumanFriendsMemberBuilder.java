// HumanFriendsMember(long id, long petID, String name, LocalDate birthdate, List<String> commands)

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanFriendsMemberBuilder {
    private Integer id = 1;
    private Integer animalId;
    private String animalDescription;
    private Integer animalTypeId;
    private String animalTypeDescription;
    private String name;
    private LocalDate birthdate;
    private List<String> commands = new ArrayList<String>();

    public void assignID(List<? extends HumanFriendsItem> humanFriendsMembersList){
        int maxID = 0;
        for(HumanFriendsItem member: humanFriendsMembersList){
            if(maxID < member.getId()){
                maxID = member.getId();
            }
        }
        id = maxID + 1;
    }

    public HumanFriendsMember build (String animalTypeDescription, String name, LocalDate birthdate) {
        String petType;
        Pets pets = new Pets();
        PackAnimals packAnimals = new PackAnimals();

        if(checkAnimalTypeDescription(animalTypeDescription)) {
            if(pets.getPetsList().containsValue(animalTypeDescription)) {
                petType = pets.getPetType();
            } else {
                petType = packAnimals.getPetType();
            }

            Animals animals = new Animals(petType);
            
            animalTypeId = getAnimalId(animalTypeDescription);
            animalId = animals.getID(animalTypeDescription);
            animalDescription = animals.getDescription();
            
            return new HumanFriendsMember(id++, animalTypeId, animalTypeDescription, animalId, animalDescription, name, birthdate, commands);
        } else {
            throw new IllegalArgumentException("There is no specified animal type");
        }
    }

    private Integer getAnimalId (String animalTypeDescritpin) {
        Pets pets = new Pets();
        PackAnimals packAnimals = new PackAnimals();
        Integer idValue = pets.getID(animalTypeDescription);

        if(!checkAnimalTypeDescription(animalTypeDescritpin)) {
            throw new IllegalArgumentException("There is no specified animal type");
        }

        if(idValue == -1) {
            idValue = packAnimals.getID(animalTypeDescritpin);
        }

        return animalId;
    }

    private boolean checkAnimalTypeDescription(String animalTypeDescription) {
        Pets pets = new Pets();
        PackAnimals packAnimals = new PackAnimals();
        
        if(pets.getPetsList().containsValue(animalTypeDescription) && packAnimals.getPackAnimalsList().containsValue(animalTypeDescription)) {
            return true;
        }
        return false;
    }

}
