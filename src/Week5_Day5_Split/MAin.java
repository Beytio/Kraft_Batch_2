package Week5_Day5_Split;

import java.util.Arrays;

public class MAin {
    public static void main(String[] args) {

//        String str1 = "kayısı,armut,üzüm,çilek,nar";
//        System.out.println(Arrays.toString(deg(str1)));
//        System.out.println(Arrays.toString());


//        String str="Merhaba java insaları";
//        String [] sArry=str.split(" ");
//        for (String s:sArry) {
//            System.out.println(s);
//        }
//sArry[1]="yurdum";
//        System.out.println(sArry[1]);
//        System.out.println(Arrays.toString(sArry));
//
//        String [] sArry1=str.split("a");
//        System.out.println(Arrays.toString(sArry1));
//
//
////        copyOfrange
//
//        String[] strArry={"yunus","ahmet","mehmet","mahmut"};
//        String[]strArry2=Arrays.copyOfRange(strArry,0,3);
//        System.out.println(strArry2.length);
//        System.out.println(Arrays.toString(strArry2));
//
//
////        sort
//
//        int[] arryi= {9,7,5,1,7,2};
//        Arrays.sort(arryi);
//        System.out.println(Arrays.toString(arryi));
//
////fill
//
//        int[] arry2= {4,7,6,1,9,2};
//        Arrays.fill(arry2,1,3,0);
//        System.out.println(Arrays.toString(arry2));
//        Arrays.fill(arry2,0);
//        System.out.println(Arrays.toString(arry2));
//        Arrays.fill(arry2,2,5,5);
//        System.out.println(Arrays.toString(arry2));
//
//
//
////        String[] strArry={"yunus","ahmet","mehmet","mahmut"};
////        String[]strArry2=Arrays.copyOfRange(strArry,0,3);
////        System.out.println(strArry2.length);
////        System.out.println(Arrays.toString(strArry2));
//
//
//    }
//
//    public static String[] morethanfive(String str){
//        String [] split=str.split(" ");
//        for (int i = 0; i < split.length; i++) {
//if (split[i].length()<5){
//    split[i]="armut";
//
//}
//
//        }
//        return  split;
//        }


//        String str="merhaba java insanları bugün nasılsınız";
        int[] arryi= {9,7,5,1,7,2};
        System.out.println(Arrays.toString(number(arryi)));

//        System.out.println(Arrays.toString(ikinci(str)));
//        System.out.println(Arrays.toString(number(n)));


    }




//    public static String[] ikinci(String str) {
//        String[] arr=str.split(" ");
//        return arr[1].split("");
//
//    }


//public static int [] number(int n) {
//
//    int[] a = new int[n];
//    for (int i = 0; i < n; i++) {
//    a[i]=i;
//    }
//
//    return a;
//}


//
//    public static int  number(int [] n) {
//        Arrays.sort(n);
//        return (n[0]+n[n.length-1])/2;
//    }



    public static int [] number(int [] n) {
        Arrays.sort(n);
        Arrays.fill(n,n[0]);
        return n;
    }

}