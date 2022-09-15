package Week3_Day2_LoopsWhile;

import java.util.Scanner;

public class BranchingStatments {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

/*
        while(true) {
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1 toplama" + "\n 2-çıkarma" + "\n3-çarpma\n4_bölme\n5_çıkış");
            System.out.print("seçiminiz: ");
            int i = scan.nextInt();

            if (i == 1) {
                while (true) {
                    System.out.print("Çıkış için toplma sıfır olmalı");
                    System.out.println("1. sayı=");
                    int a = scan.nextInt();
                    System.out.println("2. sayı=");
                    int b = scan.nextInt();
                    System.out.println("toplam =" + (a + b));
                    if ((a + b) == 0) {
                        break;
                    }
                }
            }
        }


*/







//        for (int i=0; i<10; i++){
//        if(i>4 && i<9){
//            continue;
//        }
//            System.out.println(i);
//        }




       harun: for (int i=0; i<5; i++){
            System.out.println("ilk döngü");
            for(int j=0;j<5;j++ ){
                System.out.println("merhaba");
                if(j==2){
                    continue harun;
            }
                System.out.println(" dünya");
            }

        }









    }
}
