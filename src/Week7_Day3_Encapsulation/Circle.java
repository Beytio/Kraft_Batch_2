package Week7_Day3_Encapsulation;

public class Circle {


    private double radius;
    private final double PI=3.14;



    public Circle( double radius){
        this.radius=radius;
    }


    public double getRadius() {
        return this .radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return this.PI*this.radius*this.radius;
    }




}
