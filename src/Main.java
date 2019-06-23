public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.getInfo() + " - первый");
        System.out.println("______________________________");

        Shelter shelter1 = new Shelter("Shelter#One: ", "New-York.");
        Shelter shelter2 = new Shelter("Shelter#Two: ", "Boston.");

        Dog dog2 = new Dog("Bobik", "DvorTerrier", Color.BLACK, shelter1);
        System.out.println(dog2.getInfo()  + " - второй");
        System.out.println("______________________________");

        Dog dog3 = new Dog("Juchka", "DvorTerrier", Color.BROWN, shelter2, "Stand Up");
        System.out.println(dog3.getInfo() + " - третий");
        System.out.println("______________________________");

        dog1.makeVoice();
        dog2.makeVoice("Rex", 15);
        dog3.makeVoice("Juchka");

        System.out.println("______________________________");
        System.out.println(shelter1.getName() + shelter1.getAddres());
        System.out.println(shelter2.getName() + shelter2.getAddres());
    }
}
/*3 объекта Собачек используя 3 разных конструктора (1. по-умолчанию, 2. name, breed, color, shelter 3. name, breed, color, shelter, commands)
в качестве аргумента приюта передаем ново созданный объект Приюта (Shelter)*/
//Распечатать всю информацию по 3м Собачкам +
//Переделать реализацию методов getInfo так чтоб дочерние классы не смогли перезаписать этот метод в родительском классе - final???