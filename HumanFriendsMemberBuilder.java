// HumanFriendsMember(long id, long petID, String name, LocalDate birthdate, List<String> commands)

import java.time.LocalDate;
import java.util.List;

public class HumanFriendsMemberBuilder {
    private Integer id = 1;
    private Integer animalId;
    private String animalDescription;
    private Integer animalTypeId;
    private String animalTypeDescription;
    private String name;
    private LocalDate birthdate;
    private List<String> commands;

    public void assignID(List<? extends HumanFriendsItem> humanFriendsMembersList){
        int maxID = 0;
        for(HumanFriendsItem member: humanFriendsMembersList){
            if(maxID < member.getId()){
                maxID = member.getId();
            }
        }
        id = maxID + 1;
    }

    
}
