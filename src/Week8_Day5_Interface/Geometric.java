package Week8_Day5_Interface;

public interface Geometric {

    double PI=3.14;
    double getArea();
    default double getPrimeter(double...sides){
        double primeter=0;
        for (double side: sides) {
            primeter+=side;
        }
        return primeter;
    }
}



class Square implements Geometric{

    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }
}



class run{
    public static void main(String[] args) {
        Square square1=new Square(2);
        System.out.println(square1.getArea());
        double primeter=square1.getPrimeter(4,4,4,4);
        System.out.println(primeter);


        Circle circle1=new Circle(3);
        double area=circle1.getArea();
        System.out.println(area);
    }

    }
