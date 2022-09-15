package Week1_Day4_Review;

public class TypeCasting {
    public static void main(String[] args) {

//        TypeCasting
//        int myAge = 8;
//        double mydouble = myAge;
//        System.out.println(mydouble);
 //
        // int version=2;
//double ver= version;
//System.out.println(ver);
// long a=5645555;
//double b=a;
//System.out.println(a);

//        Narrowing
//        long a=123245646;
//                double d=9.665;
//
//        int i = (int)d;
//        System.out.println(i);

//double a=2.3, b=4.1; int c=5;
//int toplam = (int)a +(int)b+c;
//System.out.println(toplam);
//        System.out.println("------------");

double a=2.3, b=4.4, c=5.3;
int d=5;
double toplam = a + b + c + d;
int son= (int)toplam;
System.out.println(son);
int toplam2= (int)(a+b+c)+d;
System.out.println("Sonuç = " +toplam2);
        System.out.println("...........");
        System.out.println("ahmet" + 10 + 5);
//        String str="ahmet"+10+5;
//        String str=5+"ahmet"+10;
//        String str=""+10+5+"ahmet"

    }
}
