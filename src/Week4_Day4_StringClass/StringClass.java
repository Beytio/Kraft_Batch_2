package Week4_Day4_StringClass;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {


        dateStamp();

//        message();

//       allChracters();
//        System.out.println("mesaageLastIndex() = " + mesaageLastIndex());

/*

//        lenght

        String str="Perşembe";
        System.out.println(str.length());
        int i =str.length();
        System.out.println(i);


//lower upper case
        String str1="javayı SeviyoRUM";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());


        //charAt

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));

    String str2="jkhadksjfklasdjflşksajfşlsajfklsadjklf";
        System.out.println(str2.charAt(str2.length()-1));//        son harfi yazdırmak

        char ch=str2.charAt(0);
        System.out.println(ch);

//        concat()

        String str3="-coğu zaman";
        System.out.println(str1.concat(str3));
        System.out.println(str1.toUpperCase().concat(str3));*/

//        String str8= scan.nextLine();


//        Scanner scan=new Scanner(System.in);
//        String ad= scan.nextLine();
//        String soyad= scan.nextLine();
//        System.out.println("ad.concat(soyad).length() = " + ad.concat(soyad).length());


//        counterOfChar(str8);
//        System.out.println("adKarakter(ad) = " + adKarakter(ad));
//        System.out.println("soyadKarakter(soyad) = " + soyadKarakter(soyad));
//        System.out.println("ad.concat(soyad) = " + ad.concat(soyad));

//        System.out.println(buyukHarf());


//    }
//    public static int counterOfChar(String str8){
//
//       return str8.length();

//    }

//    public static int adKarakter(String ad){
//        return ad.length();
//    }
//
//    public static int soyadKarakter(String soyad){
//        return soyad.length();
//    }

//    public static String buyukHarf(){
//        Scanner scan=new Scanner(System.in);
//        String ad= scan.nextLine();
//        String soyad= scan.nextLine();
//        ad.concat(soyad).toUpperCase();
//        System.out.println("buyukHarf = " +  );
//        return buyukHarf();
//    }


//        public static char mesaageLastIndex() {
//            Scanner scan = new Scanner(System.in);
//            String message = scan.nextLine();
//            System.out.println("message.charAt(message.length()-1) = "
//                    + message.charAt(message.length() - 1));
//
//            return mesaageLastIndex();
//        }

//    public static char allChracters(){
//        Scanner scan = new Scanner(System.in);
//        String message = scan.nextLine();
//        for(int i=0;i<message.length();i++){
//            System.out.println(message.charAt(i));
//        }
//return allChracters();
//    }


//    contains() METODU

//        String str = "      javayı seviyorum       ";
//        String str1 = " -her zaman.";
//        System.out.println("str.concat(str1).contains(\"vayı sev\") = " + str.concat(str1).contains("vayı sev"));
//
////        // trim
////        System.out.println("str = " + str);
//        System.out.println("str.trim() = " + str.trim());
//
//
//
////        replace
//
//        System.out.println("str.replace(\"javayı\",\"beytullahı\") = " + str.replace("javayı", "beytullahı"));
//
//        System.out.println(str.indexOf("seviyorum"));
//
//



    }

//    public static String message(){
//        Scanner scan=new Scanner(System.in);
//        String message= scan.nextLine();
//        System.out.println(message.trim());
//
//        return message;
//
//    }


    public static String dateStamp(){
        Scanner scan=new Scanner(System.in);
        String message= scan.nextLine();
       String replace =message.replace("/","");
       String replace1 = replace.replace(":","");
       String replace2= replace1.replace(" ","");
        System.out.println(replace2);


        return dateStamp();
    }



}
