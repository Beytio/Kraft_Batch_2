package Week3Day5_Methods;

import java.util.Scanner;

public class MethodsReturnType {
    public static void main(String[] args) {

//        System.out.println(LastDigitCheck(35,25));

//          System.out.println(asalsayi(1957));

//        System.out.println(num(-58));

//        System.out.println(not(45,55,68));

//       CalculateArea(5);
//        CalculateArea(5,6);

//        concat(5,"merhaba", false);
//        concat("merhaba",5);

          sayılar();

//        toplam();



    }






    public static boolean LastDigitCheck(int a,int b) {
        if (a % 10 == b % 10) {
            return true;

        }
        return false;
    }







        public static boolean asalsayi (int a){
            if (a == 0 || a == 1) {
                return false;
            } else {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        return false;
                    }
                }
            }
            return true;
    }












public static int num(int a){

        return a<0?a:a;
//        if (a<0){
//
//            int sayı;
//            sayı=(a*-1);
//            System.out.println(sayı);
//        }
//        else {
//            System.out.println(a);
//        }
//        return a;
}










public static char not(double not1, double not2, double not3){
        double ortalama =(not1+not2+not3)/3;

         if(ortalama>=76&& ortalama<=100){
             return 'A';
         } else if (ortalama >=51 && ortalama<=75) {
             return 'B';
         } else if (ortalama>=0 && ortalama<=50){
             return 'C';
         }
            return 'x';
}






//METHOD OVERLOADING




    public static void CalculateArea(int a, int b){
        System.out.println(a*b);
    }



    public static void CalculateArea(int b){
        int r;
        double pi=3.14;
        r=b;
        System.out.println(r*r*pi);
    }





    public static void concat(int i, String str, boolean bl){
        if (bl){
            System.out.println(i+str);
        }else {
            concat(str,i);
        }
    }


public static void concat(String kelime,int a){
        for (int t=0; t<a;t++){
            System.out.println(kelime);
        }
}




//  *****??????????


public static void sayılar(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen 1. sayıyı giriniz");
    int sayı1 =scan.nextInt();
    System.out.println("Lütfen 2. sayıyı giriniz");
    int sayı2 =scan.nextInt();
    if(sayı2%3!=0){
        sum(sayı1,makeMultipleThree(sayı2));
    }else{
        sum(sayı1,sayı2);
    }
}


public static int makeMultipleThree(int a){
        int multiple3;
    if (a%3>1) {
        multiple3=a+1;
        }else {
        multiple3=a-1;
        }
        return multiple3;
}


    public static void sum(int a,int b){
        System.out.println(a+b);
    }



//    /











}
