import java.time.LocalDate;
import java.util.List;

public class HumanFriendsMember implements HumanFriendsItem {
    private long id;
    private long petID;
    private String name;
    private LocalDate birthdate;
    private List<String> commands;

    int getAge();
    LocalDate getBirthDate();
    long getId();
    String getName();
}
