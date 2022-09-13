package Week3_Day1;

import java.util.Scanner;

public class Loops_If {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

//  FOR LOOP

//        for (int i=0; i<20; i++) {
//            System.out.println((i+1)+ " Merhaba Dünya");
//        }


//        for (int i=0; i<101; i++) {
//            System.out.println(i);
//        }



//    for (int i=99; i>0; i--) {
//            System.out.println(i);
//        }


//        for (int i=0; i<100; i+=2) {
//            System.out.println(i);
//        }



//        for (int i=0; i<100; i++){
//            if (i%2==1){
//                System.out.println(i);
//            }
//        }

//        for (int i=2; i<1000; i++){
//            if (i%10==0){
//                System.out.println(i);
//            }
//        }
//        System.out.println(""faktoriyeli alınacak sayısı giriniz"");
//        int fa
//int sonuc=1;
//    for (int i=6; i>0; i--){
//sonuc*=i;   }
//        System.out.println("6!=" +sonuc);
//


//        int sonuc=1;
//        for (int i=0; i<21; i++){
//            sonuc=i*i*i;
//            System.out.println(i+" ın küpü "+sonuc);
//        }


//    for (double i=23; i<51; i++){
//        double cel=((i*1.8)+32);
//        System.out.println(i+" santigrat derece " + cel +" fahrenheittir");
//    }

//        System.out.println("lütfen bir kelime giriniz");
//        String kelime= scan.nextLine();
//        System.out.println("Kelime kaç defa yazılsın");
//        int tekrar= scan.nextInt();
//
//        for (int i=0; i<tekrar;i++){
//            System.out.println(kelime);
//
//        }




//        System.out.println("lütfen 0 ile 1000 arasında bir sayı giriniz");
//        int sayi= scan.nextInt();
//
//        int sonuc=0;
//        int sonuctek= 0;
//        int sonuccift=0;
//        for (int i=0; i<=sayi;i++){
//            sonuc=sonuc+i;
//        }
//        System.out.println(sonuc);
//
//



//        System.out.println("lütfen 0 ile 1000 arasında bir sayı giriniz");
//        int sayi= scan.nextInt();
//
//        int sonuctek= 0;
//        int sonuccift=0;
//        for (int i=0; i<=sayi;i++){
//        if (i%2==1){
//            sonuctek+=i;
//            }
//        else sonuccift+=i;
//        }
//        System.out.println("tek sayılar toplamı = " + sonuctek);
//        System.out.println("çift sayılar toplamı = " + sonuccift);
//



//        System.out.println("lütfen taban sayı giriniz");
//        int taban= scan.nextInt();
//        System.out.println("lütfen üst sayı giriniz");
//        int ust= scan.nextInt();
//        int sonuc=1;
//        for (int i=0; i<ust; i++){
//            sonuc*=taban;
//
//        }
//        System.out.println(sonuc);



//       SONsUZ DÖNGÜ


//    for (;;){
//        System.out.println("harun");
//    }


//        int i=1;
//        for (;i<5;) {
//            System.out.println("harun");
//        }



//        int i=1;
//        for (int j=10;i<5;i++,j++) {
//            System.out.println(j);
//        }




//        int i=1;
//        for (int x=0,y=1;x<5;x++,y+=5) {
//            System.out.println(y);
//        }



//a dan z ye harfler

//        for (char i='A'; i<='Z';i++){
//            System.out.println(i);
//
//        }




//        for (int i=1;i<=10;i++) {
//            System.out.println("9 * "+i+" = " + (9*i));
//        }




//       String sys_password="şafak";
//        for (int i=1;i<=3;i++){
//            System.out.println("lütfen bir şifre giriniz");
//            String password= scan.nextLine();
//            if (password.equals(sys_password)){
//                System.out.println("Tebrikler şifre doğru");
//                break;
//            }
//            else {
//                System.out.println("Yanlış paralo");
//                if(i==3){
//                    System.out.println("deneme hakkınız doldu");
//                }
//            }
//        }






//}




        for (int i=0; i<5;i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
