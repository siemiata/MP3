public class CatDog extends Dog implements ICat{
    private String color;
    private int height;

    public CatDog(String name, String breed, int age, int weight) {
        super(name, breed, age, weight);
    }
    @Override
    public void speak(){
        System.out.println("Hau, miau !");
    }

}
