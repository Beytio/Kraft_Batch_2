package Week3Day5_Methods;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

    startprocess("düğün kartınız için gelin ve damadın adını giriniz");
    }

 public static void startprocess(String message){
     System.out.println(message);
     Scanner scan=new Scanner(System.in);
     String word1 =scan.nextLine();
     String word2 =scan.nextLine();
     if (word1.equals(word2)){
         goingProcess();
     }else {
       goingProcess(word1,word2);
     }
 }


    public static void goingProcess(){
        String message= "Girmiş olduğunuz isimler aynı lütfen farklı isimler giriniz";
        startprocess(message);
    }

    public static void goingProcess(String str1, String str2){
        System.out.println("--------------------");
        System.out.println("*** "+str1+" & " +str2+" ****");
        System.out.println("Mutluluklar dileriz");
        System.out.println("--------------------");
    }




}
