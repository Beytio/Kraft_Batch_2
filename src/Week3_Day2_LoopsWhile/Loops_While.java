package Week3_Day2_LoopsWhile;

import java.util.Scanner;

public class Loops_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//        for (int i=0;i<6;i++){
//        for (int j=0;j<6;j++){
//            System.out.print("1");
//        }
//            System.out.println();
//        }


//        for (int i=0;i<3;i++){
//            for (int j=0; j<2;j++){
//                System.out.println("i="+i+"j="+j );
//            }
//        }


//        String sonuc = "";
//        for (int i=0;i<6;i++){
//           sonuc="*"+sonuc;
//            System.out.println(sonuc);
//        }


//       for (int i=1;i<=5;i++){
//           for(int j=1;j<=i;j++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }


//int k=0;
//for (int i=0;i<=5;i++){
//    for(int j=1;j<=i;j++){
//        k++;
//        System.out.print(k);
//    }
//    System.out.println();
//}


//        for (int i=0;i<6;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i=0;i<6;i++){
//        for (int j=5;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i=0;i<6;i++){
//            int sonuc=0;
//            for (int j=0;j<=i;j++){
//                sonuc=sonuc+1;
//                System.out.print(sonuc);
//            }
//            System.out.println();
//        }


//        for (int i=0;i<6;i++){
//
//            for (int j=0;j<=i;j++){
//                int sonuc=i;
//                sonuc=sonuc+1;
//                System.out.print(sonuc);
//            }
//            System.out.println();
//        }


//        ödevvvvvvvv

//        int sonuc=0;
//        for (int i=0;i<4;i++){
//
//            for (int j=0;j<=i;j++){
//                sonuc=sonuc+1;
//                System.out.print(sonuc);
//            }
//            System.out.println();
//        }


//      int i=0;
//      while (i<5){
//          System.out.println("x");
//          i++;
//      }


//        int i=0;
//        while (i<5){
//            System.out.println("x");
//            i++;
//        }
//


//        int i=0;
//        while (i<101){
//            i=i;
//            System.out.println(i);
//            i++;
//        }


//        int i=15;
//        while (i<101){
//            i=i;
//            System.out.println(i);
//            i++;
//        }


//        int i=100;
//    while (i>0){
//            i=i;
//            System.out.println(i);
//            i--;
//        }


//                int i=-1;
//        while (i<101){
//            i=i+1;
//            System.out.println(i);
//            i++;
//        }


//        int i=0;
//        while (i<101){
//            i=i+1;
//            System.out.println(i);
//            i++;
//        }


// int i=1;
//        while (i<1001){
//            if (i%10==0){
//            System.out.println(i);}
//            i++;
//        }


//        int i=1;
//        int faktoriyel=1;
//    while (i<=8){
//        faktoriyel*=i;
//        i++;
//        }
//        System.out.println("8! =" + faktoriyel);


//        int i = 0;
//        int sonuc = 0;
//    while (i<=20) {
//        if (i % 3 == 0) {
//            sonuc = i * i * i;
//            System.out.println(i+ " küpü = " +sonuc);
//        }
//        i++;
//    }


//                double i = 23;
//        double fahren = 0;
//    while (i<=50) {
//            fahren = (i*1.8)+32;
//            System.out.println(i+ " derece = " + fahren+" fahrenheit tir");
//        i++; }


//        String exit="x";
//        while (true) {
//            System.out.print("lütfen bir kelime yazınız");
//            String kelime= scan.next();
//            if (kelime.equals("x")){
//                break;
//            }
//            System.out.print("Lütfen kaç defa yazdırmak istediğinizi giriniz");
//            int tekrar=scan.nextInt();
//            for(int i=0;i<tekrar;i++)
//            System.out.println(kelime);
//        }


//     do While


//      int i=0;
//      do {
//          System.out.println("merhaba dünya");
//          i++;
//      }
//      while (i<5);


//        do {
//            System.out.println("toplam 0 ise programdan çık");
//            System.out.println("1 sayı ");
//            int a= scan.nextInt();
//            System.out.println("2 sayı ");
//            int b= scan.nextInt();
//            System.out.println(a+b);
//        }
//        while (true);


//    boolean c=true;
//        do {
//            System.out.println("toplam 0 ise programdan çık");
//            System.out.println("1 sayı ");
//            int a= scan.nextInt();
//            System.out.println("2 sayı ");
//            int b= scan.nextInt();
//            System.out.println(a+b);
//            if((a+b)==0){
//                break;
//            }
//        }
//        while (c);



/*int j=0;
do {
    if(){
        break;
    }
    j++;
}
while (true);
*/



/*

        Random random=new Random();
        int i=random.nextInt(50);
        System.out.println("5 tahmin hakkın var");
int j=1;
        do {
            System.out.println(j+ " tahmin " );
            int tahmin= scan.nextInt();
            if (tahmin==i){
                System.out.println(" tebrikler sayıyı buldun");
                break;
    }else if(tahmin>i){
                System.out.println("aşağı");
            }else {
                System.out.println("yukarı");
            }
j++;
        }
        while (j<6);

/*
        boolean k = true;
        while (k) {
            System.out.println("lütfen bir Ayı");
            int sayı1 = scan.nextInt();
            System.out.println("lütfen bir Ayı");
            int sayı2 = scan.nextInt();
            int toplam = sayı1 + sayı2;
            if (toplam == 50) {
                break;
            }
            System.out.println("toplam = "+toplam);
        }

*/














    }


    }




