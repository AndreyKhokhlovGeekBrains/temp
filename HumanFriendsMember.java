import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class HumanFriendsMember implements HumanFriendsItem {
    private Integer id;
    private Integer animalTypeId;
    private String name;
    private LocalDate birthdate;
    private List<String> commands;

public HumanFriendsMember(Integer id, Integer animalTypeId, String name, LocalDate birthdate, List<String> commands) {
    this.id = id;
    this.animalTypeId = animalTypeId;
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

public void deleteCommand(){
    
};

public void printItemsByDate(){

};

public String printItemsByAnimalType(){

    return "";
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
}
