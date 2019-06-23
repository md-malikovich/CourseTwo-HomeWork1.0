import java.util.Random;

public class Pet {

    private int age;
    private String color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return new Random().nextInt();
    }

    public String getInfo() {
        return " " + this.age + " " + this.color + " " + this.shelter.getAddres() + " " + this.shelter.getName();
    }
}
