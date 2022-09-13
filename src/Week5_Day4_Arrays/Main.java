package Week5_Day4_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arry = new int[5];
        arry[0] = 9;
        arry[1] = 25;
        arry[2] = 64;
        arry[3] = 124;
        arry[4] = 225;

//        for (int i : arry) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < arry.length; i++) {
//            System.out.println(arry[i]);
//
//        }
//
//
//        System.out.println("...............");

//
//        String[] sArray = new String[3];
//        sArray[0] = "Beytullah";
//        sArray[1] = "Ahmet";
//        sArray[2] = "İhsan";
//
//        System.out.println(sArray[0].length());
//
//        System.out.println("...............");
//
//        System.out.println(sArray[0]);
//
//        System.out.println("...............");
//
//        System.out.println(Arrays.toString(sArray));
//        System.out.println(Arrays.toString(arry));


        int[] iArr1 = {1, 2, 3, 4, 5};
        int[] iArr2 = {7, 8, 9, 10, 11};
//        System.out.println(checkLenght(iArr1));
//
//        System.out.println(esitbes(iArr1));
//
//        System.out.println("...............");
//
//
//        System.out.println(esitmi(iArr1, iArr2));
//
//        System.out.println("...............");
//
//        System.out.println(yeniarry(iArr1, iArr2));
//
//        System.out.println(toplam(iArr1));

//        System.out.println(Arrays.toString(combination(iArr1, iArr2)));


//        System.out.println(maximum(iArr1));

//        System.out.println(Arrays.toString(change(iArr1)));


//        System.out.println(Arrays.toString(tersten(iArr1)));

//        System.out.println(tektoplam(iArr1));

    }
//
//    public static boolean checkLenght(int[] iArry) {
//        return iArry.length > 5;
//    }
//    public static boolean esitbes(int[] iArry2) {
//        for (int i = 0; i < iArry2.length; i++) {
//            if (iArry2[i] == 5) {
//                return true;
//            }
//        }
//        return false;
//
//    }
//    public static boolean esitmi(int[] iArry3, int[] iArry4) {
//        if (iArry3[0] == iArry4[0]) {
//            return true;
//        }
//        return false;
//
//    }
////    public static int[] yeniarry(int[] iArry5, int[] iArry6) {
////
////        int []newarry = {iArry5[0], iArry6[0]};
////
////        return newarry;
////        }

//        public static int toplam(int []iArr){
//        int sum=0;
//            for (int i = 0; i < iArr.length; i++) {
//                sum+=iArr[i];
//
//            }return sum;
//        }


//public static int[] combination (int[]iArry8,int[]iArry9){
//        int i=iArry8.length+iArry9.length;
//        int combination[]=new int[i];
//    for (int j = 0; j < combination.length; j++) {
//        if (j<iArry8.length) {
//            combination[j] = iArry8[j];
//        }else{
//            combination[j]=iArry9[j-iArry8.length];
//
//        }
//    }
//return combination;
//
//
//
//}
//
//    public static int[] combination (int[]iArry8,int[]iArry9){
//        int i=iArry8.length+iArry9.length;
//        int combination[]=new int[i];
//        for (int j = 0; j < iArry8.length; j++) {
//                combination[j] = iArry8[j];
//            }
//        for (int j = 0; j < iArry9.length; j++) {
//            combination[j+iArry8.length] = iArry9[j];
//        }
//        return combination;
//            }
//

//       public static int maximum(int[] iArry10) {
//
//        int max=0;
//        for (int i = 0; i < iArry10.length; i++) {
//        if(iArry10[i]>max){
//            max =iArry10[i];
//        }
//        }
//        return max;
//        }


//    public static int [] change(int[] iArry11) {
//
//        int temp = iArry11[iArry11.length - 1];
//        iArry11[iArry11.length - 1] = iArry11[0];
//        iArry11[0] = temp;
//        return iArry11;
//    }

//
//    public static int [] tersten(int[] iArry12) {
//       int[] ints=new int[iArry12.length];
//        for (int i = 0; i <iArry12.length; i++) {
//
//            ints[i]=iArry12[iArry12.length-1-i];
//
//        }return ints;
//    }


//    public static int tektoplam(int[] iArry13) {
//        int toplam = 0;
//        for (int i = 1; i < iArry13.length; i+=2) {
//                toplam += iArry13[i];
//
//        }return toplam;
//    }







}



