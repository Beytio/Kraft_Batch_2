package Week6_Day1_Arrays_Example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 5, 3, 26, 24, 3, 18, 88,3};
        System.out.println(toplam2(sayilar));

        System.out.println(toplam(sayilar));

        System.out.println(ciftToplam(sayilar));
        System.out.println(ciftToplam2(sayilar));

        System.out.println(ucToplam(sayilar));
        System.out.println(ucToplam2(sayilar));

    }





  
//
//        System.out.println(Arrays.toString(toplam(5)));

//        System.out.println(toplam(sayi2));

//        System.out.println(ciftToplam(sayi2));
//        System.out.println(ucToplam(sayi2));
//        System.out.println(Arrays.toString(buyukKucuk(sayi2)));



//
//    public static int []toplam(int sayi){
//        int[] sayi2=new int [1];
//        sayi2[0]=sayi;
//        return sayi2;
//    }



    //        Array’in içerisindeki tüm sayıların toplamını veren
//        metodu yazınız..

    public static int toplam(int []sayi){
        int toplam=0;
        for (int i = 0; i < sayi.length; i++) {
            toplam+=sayi[i];
        }
        return  toplam;
    }

//  2. YOL foreach ile yapılır
    public static int toplam2(int []arr){
        int result=0;
        for (int sayi:arr) {
            result+=sayi;

        }return result;
    }



//    Array’in içerisindeki tüm çift sayıların
//    toplamını veren metodu yazınız.


    public static int ciftToplam(int []sayi) {
        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] % 2 == 0) {
                toplam+=sayi[i];
            }
        }return toplam;
    }

// 2 YOL FOREACH İLE

    public static int ciftToplam2(int []arr) {
        int toplam2 = 0;
        for (int sayi:arr) {
            if (sayi % 2 == 0) {
                toplam2+=sayi;
            }
        }return toplam2;
    }


//    tüm 3 sayılarının toplamını veren method



    public static int ucToplam(int []sayi) {
        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] == 3) {
                toplam+=sayi[i];
            }
        }return toplam;
    }



//    2. yol

    public static int ucToplam2(int []arr) {
        int toplam = 0;
        for (int sayi:arr) {
            if (sayi == 3) {
                toplam+=sayi;
            }
        }return toplam;
    }


//    public static intbuyukKucuk(int []sayi) {
//int max=sayi[0],min=sayi[0];
//for (int arr:sayi){
//if(arr>max){
//    max=arr;
//}if(arr<min){
//    min=arr;
//    }
//}
//
//        return max-min;
//
//    }

//
//    public static intbuyukKucuk(int []sayi) {
//int min=sayi[0];
//for (int arr:sayi){
//    if(arr<min){
//        min=arr;
//}
//
//}
//
//        return min;
//
//    }







    public static String [] aloneNumber(int []arr){
        String aloneNumbers="";
        if (arr.length==1) {
            aloneNumbers += arr[0] + "";
            return aloneNumbers.split("");

        }
        if(arr[0]!=arr[1]) aloneNumbers+=arr[0]+" ";



        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])
                aloneNumbers+=arr[i]+" ";

        }
        if(arr[arr.length-1]!=arr[arr.length-2])
            aloneNumbers+=arr[arr.length-1]+" ";

        return aloneNumbers.split(" ");
    }






    public static boolean dublicate(int [] sayılar){
       firstloop: for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j < sayılar.length; j++) {
                if (i!=j && sayılar[i]==sayılar[j]){
                    return true;
                }
            }

        }return false;
    }






    public static int oharfi(String str,String harf){
        str =str.toLowerCase();
        String[]arr=str.split("");
        int count=0;
        for(String harf1:arr ){
            if(harf1.equals(harf)){
                count++;
            }
        }
        return count;

        }






       public static boolean tekrar(String str){

           String[]arr=str.toLowerCase().split(" ");
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length; j++) {
                   if (i!=j&&arr[i].equals(arr[j])){
                       return true;
                   }
               }
           }return false;
       }






//    public static void main(String[] args) {
//
//int []sayılar={5,7,5,4,-8,6};
//        System.out.println(Arrays.toString(enkucuk(sayılar)));
//
//    }




       public static int[] enkucuk(int sayı[]){
           int kucuk=sayı[0];
           for (int i = 0; i < sayı.length; i++) {
               if(sayı[i]<kucuk){
                   kucuk=sayı[i];
               }
           }
           int  yeniarr[]=new int[sayı.length];
         yeniarr[0]=kucuk;
           for (int i = 1; i < yeniarr.length; i++) {
               yeniarr[i]=0;

           }
return yeniarr;

       }




    }






