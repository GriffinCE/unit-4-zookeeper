public class Animal {

    // ===== Instance Variables =====
    private String animalType;

    // ===== Static Variables =====
    private static int animalCount = 0;

    // Optional: a fixed menu of animal types to choose from
    private static final String[] TYPES = {
        "Lion", "Bear", "Elephant", "Giraffe", "Zebra", "Penguin", "Snake", "Monkey"
    };

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: choose a random animal type
     * REQUIRED: increment animalCount
     */
    public Animal() {
        // TODO: set animalType to a random type from TYPES
        // TODO: increment animalCount
        animalCount++;
        animalType = TYPES[(int) (Math.random() * 8)];
    }

    /**
     * Parameterized constructor:
     * REQUIRED: set animalType to type
     * REQUIRED: increment animalCount
     */
    public Animal(String type) {
        // TODO: set animalType
        // TODO: increment animalCount
        animalCount++;
        animalType = type;
    }

    // ===== Getters / Setters =====

    public String getAnimalType() {
        return animalType;
    }

    // ===== Class-level getter =====
    public static int getAnimalCount() {
        return animalCount;
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: returns a sound based on animalType.
     * You may choose your own sounds; keep it consistent.
     */
    public String speak() {
        // TODO: return a sound depending on animalType
        // Example idea:
        // if (animalType.equals("Lion")) return "Roar!";
        if (animalType.equals("Lion")) {
            return "roar";
        } else if (animalType.equals("Bear")) {
            return "growl";
        } else if (animalType.equals("Elephant")) {
            return "trumpet";
        } else if (animalType.equals("Giraffe")) {
            return "bleat";
        } else if (animalType.equals("Zebra")) {
            return "bray";
        } else if (animalType.equals("Penguin")) {
            return "chirp";
        } else if (animalType.equals("Snake")) {
            return "hiss";
        } else {
            return "whoop";
        }
    }

    /**
     * OPTIONAL helper: return a random animal type from TYPES.
     */
    private static String randomAnimalType() {
       return TYPES[(int) (Math.random() * 8)];
    }

    public String toString() {
        return "Animal is a " + animalType + " and it says " + speak();
    }
    public static void main(String[] args) {
      Animal animal = new Animal();
      System.out.println(animal);
    }
}