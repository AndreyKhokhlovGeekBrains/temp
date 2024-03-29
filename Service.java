import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Service {

    private HumanFriends<HumanFriendsMember> humanFriendsRegistry;
    private HumanFriendsMemberBuilder builder;
    private Writable writer;

    public Service(){
        builder = new HumanFriendsMemberBuilder();
        humanFriendsRegistry = new HumanFriends<>();
        writer = new FileHandler();
        // loadHumanFriendsRegistry();
    }

    public void loadHumanFriendsRegistry() {
        try {
            humanFriendsRegistry = (HumanFriends<HumanFriendsMember>) writer.read();
        } catch (Exception e) {
            System.err.println("Error loading humanFriendsRegistry: " + e.getMessage());
        }
    }

    public void createHumanFriendsMember(String animalTypeDescription, String name, LocalDate birthdate) {
        HumanFriendsMember member = builder.build(animalTypeDescription, name, birthdate);
        humanFriendsRegistry.addHumanFriendsMember(member);
    }

    public String getHumanFriendsRegistryInfo() {
        return humanFriendsRegistry.getInfo();
    }

    public void save() {
        try {
            writer.save(humanFriendsRegistry);
        } catch (Exception e) {
            System.err.println("Error saving humanFriendsRegistry: " + e.getMessage());
        }
        
    }

    public boolean checkAnimalTypeDescription(String description) {
        return builder.checkAnimalTypeDescription(description);
    }

}