import java.util.ArrayList;
import java.util.List;

public class HumanFriends<HF extends HumanFriendsItem> {
    private int humanFriendId;
    private List<HF> humanFriends;

    public HumanFriends(){
        this(new ArrayList<>());
    }

    public HumanFriends(List<HF> humanFriends) {
        this.humanFriends = humanFriends;
    }

    public List<HF> getHumanFriends() {
        return humanFriends;
    }
    
}
