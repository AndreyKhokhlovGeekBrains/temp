public interface View {
    void start();
    void answer(String answer);
    void addHumanFriendsMember();
    void deleteHumanFriendsMember();
    void printCommands();
    void addNewCommand();
    void deleteCommand();
    void printNumberOfAnimalsByType(String animalType);
    void sortByBirthdate();
    void save();
    void loadHumanFriends();
    void exit();
}