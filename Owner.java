public class Owner extends Person{
    private int age;
    private int numberOfAnimals;

    public Owner(String name, String surname, int age, int numberOfAnimals) {
        super(name, surname);
        this.age = age;
        this.numberOfAnimals = numberOfAnimals;
    }

    @Override
    public String hobby() {
        return "Sport";
    }
}
