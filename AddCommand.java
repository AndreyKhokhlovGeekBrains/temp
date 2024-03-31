public class AddCommand extends Command {

    public AddCommand(View view) {
        super("Add command", view);
    }

    @Override
    public void execute() {
        getView().addNewCommand();
    }

}
