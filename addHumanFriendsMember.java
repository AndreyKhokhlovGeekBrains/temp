public class addHumanFriendsMember extends Command{
    public addHumanFriendsMember(View view) {
        super("Add a human friends member", view);
    }

    public void execute() {
        getView().addHumanFriendsMember();
    }
}
