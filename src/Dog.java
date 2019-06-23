import java.util.Random;

final public class Dog extends Pet {

    private String name;
    private String breed;
    private String commands;
    private Color color;            // создал новое поле
    private Shelter shelter;    // создал новое поле

    public Dog() {}

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.shelter = shelter;
        this.color = color;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.shelter = shelter;
        this.color = color;
        this.commands = commands;
    }

    public static void makeVoice(String voice) {
        System.out.println("Gav");
    }

    public static void makeVoice(String voice, int number) {
        int i = new Random().nextInt(15);
        String v1 = "Juchka";
        System.out.println(v1 + " have " + i + " pets.");
    }

    public static void makeVoice() {
        String v2 = "Gav-gav";
        int i = 2;
        System.out.println("The dog make voice " + v2 + ". " + "The dog is " + i + " years old.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String getInfo() {
        return "Name " + this.name + " Breed " + this.breed + " Commands " + this.commands + " Color " + this.getColor() + " Shelter " + this.getShelter();
    }
}
