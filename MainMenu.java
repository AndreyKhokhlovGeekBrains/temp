import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandsList;

    public MainMenu(View view) {
        commandsList = new ArrayList<>();
        commandsList.add(new addHumanFriendsMember(view));
        // commandList.add(new SortByBirthdate(view));
        // commandList.add(new SaveFamilyTree(view));
        // commandList.add(new LoadFamilyTree(view));
        commandsList.add(new Exit(view));
    }

    public String print(){
        StringBuilder sb = new StringBuilder();
        sb.append("List of commands:\n");
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

    // public int size(){
    //     return commandsList.size();
    // }
}