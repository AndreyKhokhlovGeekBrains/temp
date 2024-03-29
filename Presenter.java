import java.time.LocalDate;
import java.util.Scanner;

public class Presenter {
    private View view;
    private Service service;
    private Scanner scanner = new Scanner(System.in);

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHumanFriendsMember(String animalTypeDescription, String name, LocalDate birthdate) {
        service.createHumanFriendsMember(animalTypeDescription, name, birthdate);
    }

    public void getHumanFriendsRegistryInfo() {
        String answer = service.getHumanFriendsRegistryInfo();
        view.answer(answer);
    }

    public void save() {
        service.save();
    }

    public boolean checkAnimalTypeDescription(String description) {
        return service.checkAnimalTypeDescription(description);
    }

}