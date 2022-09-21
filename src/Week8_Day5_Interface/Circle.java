package Week8_Day5_Interface;

public class Circle extends Square implements Geometric{

    final double PI=3.14;
    public Circle(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return Geometric.PI*Math.pow(a,2);
    }
}
