import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandsList;

    public MainMenu(View view) {
        commandsList = new ArrayList<>();
        commandsList.add(new PrintRegistry(view));
        commandsList.add(new AddHumanFriendsMember(view));
        commandsList.add(new DeleteHumanFriendsMember(view));
        commandsList.add(new PrintCommands(view));
        commandsList.add(new AddCommand(view));
        commandsList.add(new DeleteCommand(view));
        commandsList.add(new SortByBirthdate(view));
        commandsList.add(new CountByAnimalType(view));
        commandsList.add(new Exit(view));
    }

    public String print(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nList of commands:\n");
        for (int i = 0; i < commandsList.size(); i++) {
            sb.append(i + 1)
                    .append(". ")
                    .append(commandsList.get(i).getDescription())
                    .append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice){
        Command command = commandsList.get(choice - 1);
        command.execute();
    }

    public int size(){
        return commandsList.size();
    }
}