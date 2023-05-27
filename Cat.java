public class Cat extends Animal{
    String color;
    int height;

    public Cat(String name,String color, int height) {
        super(name);
        this.color = color;
        this.height = height;
    }


    @Override
    public void speak() {
        System.out.println("Miau, miau!");
    }
}