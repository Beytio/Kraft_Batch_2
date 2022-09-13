package Week7_Day1_Constructor;

public class Main {
    public static void main(String[] args) {
        String x="harun ayşe fayma mehmet";
        String []arg=x.split(" ");

        for (int i = 0; i < arg.length; i++) {
            System.out.println((i+1)+ ". argüman  :"+ arg[i]);

        }


    }
}
