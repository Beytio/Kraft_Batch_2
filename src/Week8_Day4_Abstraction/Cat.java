package Week8_Day4_Abstraction;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cats eat a lot of things.");
    }

    @Override
    public void move() {
        System.out.println("Cats are good runner.");
    }
}
