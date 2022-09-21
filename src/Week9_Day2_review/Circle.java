package Week9_Day2_review;

public class Circle {
    private final static double PI=3.14;
    private double radius;

    public Circle(){}
    Circle(int radius){
        this.radius=radius;
    }

    public void setRadius(double radius){
    if (radius>0){
        this.radius=radius;
        }else {
        System.out.println("Yarıcap 0 ve 0 dan küçük olamaz");
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double alan(){
        return Math.pow(this.radius,2)*PI;
    }

    public double cevre(){
        return 2*PI*this.radius;
    }

//    public static double alan(double radius){
//        return Math.pow(radius,2)*PI;
//    }
//
//    public static double cevre(double radius){
//        return 2*PI*radius;
//    }
}
