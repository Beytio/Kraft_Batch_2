package Week7_Day4_Static;

import java.util.Random;

public class Geometric {

    static int primeter;
    static int counterSides;


    public static void setPrimeter(int ... sides){
        for (int i :sides) {
            primeter+=i;
            counterSides++;

        }
        System.out.println(primeter);
        System.out.println(counterSides);
    }
}
class main4{
    public static void main(String[] args) {
        Geometric.setPrimeter(2,3,8,generateSide());


    }
    public static int generateSide(){
        Random nm=new Random();
        return nm.nextInt(10);
    }
}
