package Week8_Day1_Inheritance;

import Week8_Day2.Fabrika;

public class Main_İnheritance {
    public static void main(String[] args) {
//        Class_A aObjesi=new Class_A();
//        aObjesi.a=5;
//        Class_B bObjesi=new Class_B();
//        bObjesi.a=10;
//        System.out.println(aObjesi.a);// burada a class A da static oluğu için hepsi olur
//        System.out.println(bObjesi.a);// static olursa obje ait oluyo
//        System.out.println(Class_A.a);// static olmazsa burada hata verir
//        System.out.println(Class_B.a);// static olmazsa burada hata verir
//// AYnı şekilde private a olursa da dişarıdan değiştirilemez
//

    Automobile car1=new Automobile();
    car1.color="blue";
    car1.hb=110;
    car1.model=1991;
    car1.radioBrand="pioneer";
    car1.start();
    car1.stop();

//    Automobile car2=new Automobile();
//        car2.color="red";
//        car2.hb=115;
//        car2.model=2000;
//        car2.radioBrand="sony";
//        car2.start();
//        car2.stop();
//
//
//    Motorcycle motorcycle1=new Motorcycle();
//    motorcycle1.cc=250;
//    motorcycle1.model=2012;
//        System.out.println(motorcycle1.changeCcHp());
//        motorcycle1.start();// burda da overriding var
//
//        System.out.println(car1.color);
//        System.out.println(car2.color);


// son atanan renk kırmzı olduğu için static
// olduğu için vehicle da ikisinde de red verir


//        Cat minnos=new Cat();
//        minnos.talk();
//        Dog karabas =new Dog();
//        karabas.talk();


VanKedisi vanKedisi=new VanKedisi(4,"white",true);





    }


//    /// Method Overloading
//    public int sum(int a,int b){
//        return a+b;
//    }
//
//    public int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    public double sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
//    public double sum(int a,double b,int c,int d){
//        return a+b+c+d;
//    }
}
