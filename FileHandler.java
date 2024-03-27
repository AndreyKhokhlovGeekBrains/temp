
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler implements Writable{
    private String filePath = "src/homeWork/src/model/writer/tree.txt";
    
    public boolean save(HumanFriends tree) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(tree);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

        public HumanFriends read(){
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
                return (HumanFriends) objectInputStream.readObject();
            } catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }
    }