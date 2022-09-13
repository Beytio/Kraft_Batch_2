package Week3Day4_Methods;

import java.util.Scanner;

public class Methods {


    public static void main(String[] args) {

//          ikinciyol();
//        büyüksayı();
//        aritmetik();
//        message();
//        cevrim();
//        short s=5;
//        message4(s);
//        message4((int)6.5);
//         message5(" Cuma ",12);
//         yas(1992);
//    kuvvet(5,2);
//        kuvvet(2,5);
//
//
//        toplam(15,28);
    calculator(10,2,"+");

//        sum(5,2);// burada sonuç alamıyoruz sonuç almak için aşağıdakileri yapmalıyız

//        System.out.println(sum(5,6));
//        int sonuc=sum(5,7);
//        System.out.println(sonuc);
//        int yenisonuc=sonuc+19;
//        System.out.println(yenisonuc);



//
//    }
//
//    public static void message() {
//        System.out.println("kljsdfjs");
//        message1();
//    }
//    public static void message1(){
//        message2();
//    }
//
//    public static void message2(){
//        System.out.println("Hello world");
//    }


        }


    public static void aritmetik(){

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen 3 sayı giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("girmiş olduğunuz sayıların ortalamsı " + (a + b + c) / 3 + "dir");

    }





    public static void büyüksayı(){

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen 2 sayı giriniz");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
            if (sayı1>sayı2){
    System.out.println("İki sayıdan büyüğü"+ sayı1+" dir");
}
    else {    System.out.println("İki sayıdan büyüğü"+ sayı2+" dir");
}
    }



    public static void ikinciyol() {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen 2 sayı giriniz");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int sonuc = sayı1 > sayı2 ? sayı1 : sayı2;
        System.out.println(sonuc);

    }

//    kilo okka cinsi

    public static void cevrim(){
        Scanner scan=new Scanner(System.in);

        System.out.println(" Lütfen kilogram giriniz");
        double kilo = scan.nextDouble();;
        double okka = kilo/1.282;
        System.out.println(kilo+" kilogram " +okka+" okkadır");
    }



    public static void message4(int num){
        System.out.println(num+" burada");
        System.out.println(num+3);
}



public static void message5(String str, int i){

    System.out.println("ayın "+ i+ " i"+ str+ " dir.");
}


    public static void yas(int a) {
        int yıl = 2022;
        System.out.println("yaşınız " + (yıl - a));

    }


    public static void kuvvet(int a, int b) {
        double sonuc = Math.pow(a,b);
        System.out.println(sonuc);

    }

    public static void toplam(int a, int b) {
        int sonuc = a+b;
        System.out.println(a+ " + "+b+ " = "+sonuc);
    }



    public static void calculator(int a, int b, String işlem) {

        if(işlem.equals("*")){
            System.out.println(a*b);
        }
      if (işlem.equals("+")) {
            System.out.println(a+" + "+b+" = "+(a+b));
        }
      else if(işlem.equals("-")){
            System.out.println(a-b);
        }
     else if (işlem.equals("/")){
            System.out.println(a/b);
        }


    }



public static int sum(int a,int b){
//    int sum;
//    sum =a+b;
//    return sum;
//
    return a+b; // bu kısmı yukarıda sysprint içinde kullanmamıız gerekiyor.




    }


    }