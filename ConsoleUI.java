import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean check;
    private MainMenu menu;
    private DateBuilder dateBuilder = new DateBuilder();

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        check = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Hello!");
        while (check){
            printMenu();
            scanMenu();
        }
    }

    private void printMenu(){
        System.out.println(menu.print());
    }

    private void scanMenu() {
        String choiceStr = scanner.nextLine();

        boolean check = true;
        int maxValue = menu.size();
        while(check){
            try {
                int choice = Integer.parseInt(choiceStr);
                if (choice >= 1 && choice <= maxValue) {
                    menu.execute(choice);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number");
            }
        } 
    }

    public void answer(String answer) {

    }

    public void addHumanFriendsMember() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        String animalTypeDescription = null;
        boolean check = true;

        while(check) {
            System.out.println("Enter animal type:");
            animalTypeDescription = scanner.nextLine();
            if (presenter.checkAnimalTypeDescription(animalTypeDescription)) {
                check = false;
            } else {
                System.out.println("Please enter correct animal type description");
            }
        }

        System.out.println("Enter birth date: ");
        LocalDate birthdate = dateBuilder.buildDate();

        presenter.addHumanFriendsMember(animalTypeDescription, name, birthdate);
        presenter.getHumanFriendsRegistryInfo();
    }

    public void exit() {
        System.out.println("Would you like to save your changes? Y/N");
        String prompt = scanner.nextLine().toLowerCase();
        if(prompt.equals("y")){
            save();
        }
        System.out.println("Bye-bye");
        check = false;
    }

    

    public void deleteHumanFriendsMember() {

    };

    public void printCommands() {

    };

    public void addNewCommand() {

    };

    public void deleteCommand() {

    };

    public void printNumberOfAnimalsByType(String animalType) {

    };

    public void sortByBirthdate() {

    };

    public void save() {
        presenter.save();
    };

    public void loadHumanFriends() {

    };


}