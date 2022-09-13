package Week5_Day3_Arrays;

import java.nio.ReadOnlyBufferException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    String str="kalem","kağıt";// BU ŞEKİLDE TANIMLAMA YAPAMIYORUZ
//        ANCA ARRAYS VASITASIYLA BU MÜMKÜN

//        String str="kalem";
//        String str2;

//        String [] str= new String[5];  //   String str []; ŞEKLİNDE DE OLUR
//
//        String str1[]=new String[6];
//        String [] str2={"kewi","klakl","kjlakjdls","kjasl","kswjd","kaslk"};
//        System.out.println(str2);
//
//    int sayi2[]=new int[5];
//    sayi2[0]=1;
//    sayi2[1]=3;
//    sayi2[2]=8;
//    sayi2[3]=23;
//    sayi2[4]=99;
//        System.out.println(sayi2);
//
//        double [] sayı4 = new double[6];
//    boolean [] tf= new boolean[2];

//        String[] str = new String[5];
        //      System.out.println(str[0]);

//        str[0] = "Mehmet";
        //     System.out.println(str[0]);

//
//        int ornek[] = new int[5];
//        ornek[0] = 1;
//        ornek[1] = 2;
//        ornek[2] = 4;
//        ornek[3] = 8;
//        ornek[4] = 16;
////        System.out.println(ornek[0]);
////        System.out.println(ornek[1]);
////        System.out.println(ornek[2]);
////        System.out.println(ornek[3]);
////        System.out.println(ornek[4]);
////        System.out.println(ornek[1] * ornek[2]);
//
//        for (int i = 0; i < ornek.length; i++) {
//            System.out.println(ornek[i] * ornek[i]);
//
//
//        }
//
//
//        String dayOfWeek[] = new String[7];
//        dayOfWeek[0] = "Monday";
//        dayOfWeek[1] = "Tuesday";
//        dayOfWeek[2] = "Wednesday";
//        dayOfWeek[3] = "Thursday";
//        dayOfWeek[4] = "Friday";
//        dayOfWeek[5] = "Saturday";
//        dayOfWeek[6] = "Sunday";
//        System.out.println("Today is " + dayOfWeek[2] + ".");
//
//        if (dayOfWeek[2].equals("Wednesday")) {
//            System.out.println("Today is " + dayOfWeek[2]);
//        } else {
//            System.out.println("Today is not " + dayOfWeek[2]);
//
//        }
//
//        for (int i = 0; i < dayOfWeek.length; i++) {
//            if (dayOfWeek[i].equals("Friday")) {
//                System.out.println("true");
//                break;
//            } else {
//                if(i==6){
//                    System.out.println("false");
//                }
//            }
//        }

//
//
//int [] array=new int[5];
//int array2[]= new int[4];
//int array3[];
//array3=new int[5];
//
//int [] array4={1,5,7,99,125};
//        System.out.println(array4[3]);
//
//     String str[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
//        System.out.println(str[0]);
//
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("isminiz");
//        String isim= scan.nextLine();
//
//        String str14[]={"Ali","veli","49","50","friday"};
//        int count=0;
//        for (int i = 0; i < 5; i++) {
//            if(str14[i].equalsIgnoreCase(isim)){
//                count++;
//            }
//
//        }
//    if (count>0){
//        System.out.println("ismizniz vardır");
//    }else {
//        System.out.println("isminiz yoktur");
//    }



//        int x= random.nextInt(100);
//        System.out.println(x);


//        int [] rakam=new int[20];
//        Random random=new Random();
//        for (int i = 0; i < rakam.length; i++) {
//            rakam[i]=random.nextInt(100);
//            System.out.println(rakam[i]);
//        }
//        System.out.println("hgjkh"+rakam[17]);


        int çift=0;
        int tek=0;
        int [] rakam=new int[20];
        Random random=new Random();
        for (int i = 0; i < rakam.length; i++) {
            rakam[i]=random.nextInt(100);
            System.out.println(rakam[i]);
            if (rakam[i]%2==0){
              çift++;
            }else{
                tek++;
            }
        }
        System.out.println("çift sayı =" +çift);
        System.out.println("Tek sayı =" +tek);





    }

}
