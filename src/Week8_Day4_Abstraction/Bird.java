package Week8_Day4_Abstraction;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Birds eat snake.");
    }

    @Override
    public void move() {
        System.out.println("Birds fly high.");

    }
}
class parrot extends Bird{

    public parrot(String name) {
        super(name);
    }
    // bu ilk sırada extend olmadığı için
    // hata vermez override yapmasakta
}