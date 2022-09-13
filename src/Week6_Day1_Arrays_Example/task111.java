package Week6_Day1_Arrays_Example;

import java.lang.reflect.Array;

public class task111 {

//    //        String str="dün akşama eve giderkenn onları görmüştüm";
////        System.out.println(kelimeler(str));
//
//    String [][] doubleArray=new String[5][2];
//        System.out.println(doubleArray.length);
//
//    doubleArray[0][0]="harun";
//    doubleArray[0][1]="mehmet";
//    doubleArray[1][0]="mustafa";
//    doubleArray[1][1]="ahmet";
//    doubleArray[2][0]="mahmut";
//    doubleArray[2][1]="muhammed";
//        System.out.println(doubleArray[2][1]);

//    public static String kelimeler(String str){
//        String yeni="";
//        for (int i = 0; i < str.length(); i++) {
////            str.replaceFirst("ü","");
//            yeni += str.substring(str.indexOf("ü")-1,str.indexOf("ü"));
//            str= str.replaceFirst("ü","a");
//
//
//        }return yeni;
//    }





    public static void main(String[] args) {

int sayılar[]={1,2,3,4,5,6,7,8,9,15,14,18,19,21,23};
        System.out.println(asalsayılar(sayılar));

    }

public static String  asalsayılar(int [] sayılar){
        String result=" ";
    firstloop: for (int sayi:sayılar){
if(sayi==2) {result+=sayi+" ";}
else if (sayi==0||sayi==1) {continue firstloop;}

 else{
    for (int i = 2; i < sayi; i++) {
        if (sayi%i==0){
            continue firstloop;
        }
    } result+=sayi+" ";
}
    }
    return result;
    }



}
