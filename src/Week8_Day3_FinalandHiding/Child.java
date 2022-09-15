package Week8_Day3_FinalandHiding;

public class Child extends Parent{

    protected int num=50;
//
//    public void start2(){
//        System.out.println(super.num);// Parent sınıfındaki protected değişkeni
        // direkt çağırabiliriz



    public void run(){
        System.out.println("Child runs");
    }





    }

// eğer bu sınıf içinde de int num varsa diğer package daki num
// değerini super ile çağırmamız gerkiyor

