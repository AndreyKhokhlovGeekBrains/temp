import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class HumanFriendsMember implements HumanFriendsItem {
    private Integer id;
    private Integer animalTypeId;
    String animalTypeDescription;
    Integer animalID;
    String animalDescription;
    private String name;
    private LocalDate birthdate;
    private List<String> commands;

public HumanFriendsMember(
    Integer id, 
    Integer animalTypeId, 
    String animalTypeDescription, 
    Integer animalID, 
    String animalDescription, 
    String name, 
    LocalDate birthdate, 
    List<String> commands
    ) {
    this.id = id;
    this.animalTypeId = animalTypeId;
    this.animalTypeDescription = animalTypeDescription;
    this.animalID = animalID;
    this.animalDescription = animalDescription;
    this.name = name;
    this.birthdate = birthdate;
    this.commands = commands;
}

public String printCommandsList() {
    StringBuilder sb = new StringBuilder();
    sb.append("Commands: ");
        if(!commands.isEmpty()) {
            for (int i = 0; i < commands.size(); i++) {
                if (i < commands.size() - 1) {
                    sb.append(commands.get(i)).append("; ");
                } else {
                    sb.append(commands.get(i));
                } 
            }
        }
    return sb.toString();
}
    
public void addNewCommand(String command) {
    commands.add(command);
};

public void deleteCommand(Integer itemNum){
    commands.remove(itemNum);
};

public String getName(){
    return name;
};

public Period getAge(){
    Period period = Period.between(LocalDate.now(), birthdate);
    return period;
};

public LocalDate getBirthDate(){
    return birthdate;
};

public Integer getId() {
    return id;
}

public Integer getAnimalTypeID(){
    return animalTypeId;
}

@Override
public String toString() {
    return getInfo();
}

public String getInfo () {
    StringBuilder sb = new StringBuilder();
    sb.append(id)
            .append(", ")
            .append(animalTypeId)
            .append(" ")
            .append(animalTypeDescription)
            .append(" ")
            .append(animalID)
            .append(", ")
            .append(animalDescription)
            .append(", ")
            .append(name)
            .append(", ")
            .append(birthdate)
            .append(", ")
            .append(getCommands(commands));
    return sb.toString();
}

private String getCommands(List<String> commands) {
    StringBuilder sb = new StringBuilder();
    int numOfListItems = commands.size();
    String result;
    
    if(!commands.isEmpty()) {
        sb.append("{");
        for (int i = 0; i < numOfListItems; i++) {
            if(i < numOfListItems - 1) {
                sb.append(commands.get(i)).append(", ");
            } else {
                sb.append(commands.get(i)).append("}");
            }
        }
        result = sb.toString();
    } else {
        result = "{}";
    }
    return result; 
}

}
