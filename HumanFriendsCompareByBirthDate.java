import java.util.Comparator;

public class HumanFriendsCompareByBirthDate<HF extends HumanFriendsItem> implements Comparator<HF> {
    @Override
    public int compare(HF f1, HF f2) {
        return f1.getBirthDate().compareTo(f2.getBirthDate());
    }

}
