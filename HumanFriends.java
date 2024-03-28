import java.util.ArrayList;
import java.util.List;

public class HumanFriends<HF extends HumanFriendsItem> {
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

    public boolean addHumanFriendsMember(HF member) {
        if(member == null) {
            return false;
        }

        if(!humanFriends.contains(member)) {
            humanFriends.add(member);
            return true;
        }
        return false;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("In the registry: ");
        sb.append(humanFriends.size());
        sb.append(" animals: \n");
        for(HF member: humanFriends){
            sb.append(member);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void printItemsByDate(){

    };
    
    public String printItemsByAnimalType(){
    
        return "";
    };
    
}
