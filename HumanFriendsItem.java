import java.time.LocalDate;
import java.time.Period;

public interface HumanFriendsItem {
    String printCommandsList();
    void addNewCommand(String command);
    void deleteCommand(Integer itemNum);

    String getName();
    Period getAge();
    LocalDate getBirthDate();
    Integer getId();
}
