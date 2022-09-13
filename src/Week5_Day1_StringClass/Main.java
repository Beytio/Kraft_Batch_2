package Week5_Day1_StringClass;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

//        String str="mErHaba";
//        String str2="dünya";
//        String str3="MERHABA";
//        System.out.println(str.length());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.trim());
//        System.out.println(str.charAt(3));
//        System.out.println(str.concat(str2));
//        System.out.println(str.contains("a"));
//        System.out.println(str.replace("M", "a"));
//        System.out.println(str.replaceFirst("a", "e"));
//        System.out.println(str.indexOf("E"));
//        System.out.println(str.equals(str3));
//        System.out.println(str.equalsIgnoreCase(str3));
//        System.out.println(str.isEmpty());
//        System.out.println(str.startsWith("M"));
//        System.out.println(str3.startsWith("M"));
//        System.out.println(str.endsWith("ba"));
//        System.out.println(str.substring(1));
//        System.out.println(str.substring(1, 3));

        System.out.println(firstThreeDigit("a"));
        System.out.println(repSpace("merhaba nasılsınız iyi misiniz"));
        System.out.println(scondHalf("merhabadunya"));
        System.out.println(first("Merhaba", "a", "i"));
        System.out.println(threTimes("drfg ghfg"));
        System.out.println(harfSayısı("merhaba", "a"));
        System.out.println(remove("merhaba", "a"));
        System.out.println(kelime("skinlemek", "skin"));
    }







    public static String firstThreeDigit(String str){
        if(str.length()<3){
            return str;
        }
           return str.substring(0,3);
    }




    public static String repSpace(String str){
        return str.replace(" ","%");
    }




    public static String scondHalf(String str){
        return str.substring(str.length()/2);
    }



    public static String first(String str, String old,String new1){

        return str.replaceFirst(old,new1);
    }



public static String threTimes(String str){
    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(str.charAt(i));
        }

//        System.out.print(str.charAt(i));
//        System.out.print(str.charAt(i));
    }
        return "";
}



public static int harfSayısı(String str, String str2){
    int sonuc=0;
    for (int i = 0; i < str.length(); i++) {
        if(str.substring(i,i+1).equalsIgnoreCase(str2)){
            sonuc++;
        }
    }
        return sonuc;
}




public static String remove(String str,String str2){
    System.out.println(str.replace(str2, ""));

    return "";
}



public static String kelime(String str, String str2){
        if(str.substring(0,str2.length()).equals(str2)){
            System.out.println("true");
        }else if(str.substring(1,str2.length()+1).equals(str2)){
            System.out.println("true");
        }else {
            System.out.println("False");
        }
        return "";
}










}
