public class Dog extends Animal{
    private String breed;
    private int age;
    private float weight;

    public Dog(String name, String breed, int age, int weight) {
        super(name);
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println("Hau, hau!");
    }
}
