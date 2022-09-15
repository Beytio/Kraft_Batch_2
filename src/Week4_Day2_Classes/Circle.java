package Week4_Day2_Classes;

public class Circle {
    final static double PI=3.14;
    int r;


    public double alanHesapla(){
        double alan=PI*r*r;

       return alan;
    }


    public double cevreHesapla(){
        double cevre=2*PI*r;

        return cevre;
    }


    public static double cevreHesapla(int yarıcap){
        double cevre=2*PI*yarıcap;

        return cevre;
    }

    public static double alanHesapla(int yarıcap){
        double alan=PI*yarıcap*yarıcap;

        return alan;
    }
}
