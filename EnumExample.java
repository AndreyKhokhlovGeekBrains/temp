public class EnumExample {
    public enum AnimalType {
        PETS(1, "Pets"),
        PACK_ANIMALS(2, "PackAnimals");

        private final int code;
        private final String description;

        AnimalType(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        AnimalType petType = AnimalType.PETS;
        AnimalType packAnimalType = AnimalType.PACK_ANIMALS;

        System.out.println(petType.getCode() + ", " + petType.getDescription());
        System.out.println(packAnimalType.getCode() + ", " + packAnimalType.getDescription());
    }
}