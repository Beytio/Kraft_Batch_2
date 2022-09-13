package Week4Day4_StringClass;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        System.out.println(kelimeler());


//    for (int i=1;i<=10;i++){
//        System.out.print(i);
//    if (i<10){
//            System.out.print("-");
//        }
//    //else{
////        System.out.print("");
////    }
//    }




        }

    public static int kelimeler(){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        return str2.indexOf(str1.charAt(0));
    }









    }

