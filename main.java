public class main {
    public static void main(String[] args) {
        PackAnimals packAnimals = new PackAnimals();


        packAnimals.addNewPackAnimalType("newType");
        System.out.println(packAnimals.printPackAnimalTypes());

        packAnimals.removePackAnimalType("Donkeys");
        System.out.println(packAnimals.printPackAnimalTypes());
        System.out.println(packAnimals.printPackAnimalsByID(2));
    }
}
