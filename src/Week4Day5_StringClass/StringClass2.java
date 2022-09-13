package Week4Day5_StringClass;

import java.util.Scanner;

public class StringClass2 {
    public static void main(String[] args) {


        System.out.println(message("beytullah", "oguz"));

//        System.out.println(message("sev kjlsd kjlkjsda kllkasdf"));

//        equals()

//        System.out.println(countY("javayı seviYOrmuyum"));
//        System.out.println(sesliHarfler("javayı seviYOrmuyum"));

    }
//
//    public static int countY(String str){
//        int count=0;
//        for (int i=0;i<str.length();i++){
//
//            if(str.charAt(i)=='y'|| str.charAt(i)=='Y'){
//                count++;
//
//            }
//        }
//        return count;
//    }
//
//
//    public static String sesliHarfler(String str){
//        String count="";
//        for (int i = 0; i < str.length(); i++) {
//            switch (str.charAt(i)){
//                case'a','e','u','ı':
//                count+=str.charAt(i);
//                break;
//                default:
//
//            }
//
//        }
//        return count;
//
//
//
//
//
//    }




    // isEmpty()

    // substring()
// public static String message(String str){
////        String str;
//        if (str.contains("sev")){
//            System.out.println("ne hoş insan");
//        }
//     return str;
// }

//public static String message(String str){
////        String str;
////    String message;
//        System.out.println((str.charAt(str.length()-3))+""+(str.charAt(str.length()-2))+(str.charAt(str.length()-1)));
//
//    return str;
//}


//    public static String message(String str){
////        String str;
////    String message;
//        System.out.println((str.charAt((str.length()/2)-1))+""+(str.charAt(str.length()/2))+(str.charAt((str.length()/2)+1)));
//
//        return str;
//    }


//    public static String message(String str){
////        String str;
////    String message;
////        System.out.println((str.charAt((str.length()/2)-1))+""+(str.charAt(str.length()/2))+(str.charAt((str.length()/2)+1)));
//        System.out.println(str.substring(((str.length() / 2) - 1), ((str.length() / 2) + 2)));
//
//        return str;
//    }


    public static String message(String str1, String str2){

        if (str1.length()<str2.length()){
           return str2.substring(0,str1.length()-1).concat(str1);

        }else{
           return str1.substring(0,str2.length()).concat(str2);
        }

    }

}
