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

        int i;
        for (i = 0; i < 3; i++) {
            dog1.makeVoice();
            dog2.makeVoice("Rex", 15);
            dog3.makeVoice("Juchka");
        }

        System.out.println("______________________________");
        System.out.println(shelter1.getName() + shelter1.getAddres());
        System.out.println(shelter2.getName() + shelter2.getAddres());
    }
}
//a) 2 новых объекта Приюта (Shelter)
//b) 3 объекта Собачек используя 3 разных конструктора (1. по-умолчанию, 2. name, breed, color, shelter
// 3. name, breed, color, shelter, commands) в качестве аргумента приюта передаем ново созданный объект в пункте a.
//c) Распечатать всю информацию по 3м Собачкам
//d) Заставить полаять 3х Cобачек, вызывая разные методы makeVoice.

//Создать класс Dog наследуя его от Pet с полями: name, breed, commands.
//Создать getter-ы и setter-ы для полей класса
//Создать 3 конструктора (1. по-умолчанию, 2. name, breed, color, shelter 3. name, breed, color, shelter, commands)
//Создать 3 перегруженных метода void makeVoice(String voice, int number)
//Создать метод public String getInfo() который перезапишет метод родительского класса и будет возвращать всю информацию по полям

//В классе Main создать 3х Собак тремя разными конструкторами
//Распечатать всю информацию о Собаках
//Распечатать лай собак 3мя разными методами makeVoice

//Переделать реализацию методов getInfo так чтоб дочерние классы не смогли перезаписать этот метод в родительском классе
//Сделать класс Dog не наследуемым
