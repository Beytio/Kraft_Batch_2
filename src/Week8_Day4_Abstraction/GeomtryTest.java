package Week8_Day4_Abstraction;

public class GeomtryTest {
    public static void main(String[] args) {
        Circle circle=new Circle("daire",3);
        Square square=new Square("kare",4);
        System.out.println(circle.info());
        System.out.println(square.info());
    }
}
