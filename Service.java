import java.time.LocalDate;
import java.util.Scanner;

public class Service {

    private HumanFriends<HumanFriendsMember> humanFriendsRegistry;
    private HumanFriendsMemberBuilder builder;
    Writable writable;

    public Service(){
        builder = new HumanFriendsMemberBuilder();
        humanFriendsRegistry = new HumanFriends<>();
        writable = new FileHandler();
    }

    public void createHumanFriendMember(String animalTypeDescription, String name, LocalDate birthdate) {
        HumanFriendsMember member = builder.build(animalTypeDescription, name, birthdate);
        humanFriendsRegistry.addHumanFriendsMember(member);
    }

    public String getHumanFriendsInfo() {
        return humanFriendsRegistry.getInfo();
    }

    public void save() {
        writable.save(humanFriendsRegistry);
    }


}