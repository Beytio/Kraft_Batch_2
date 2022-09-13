package Week7_Day4_Static;

public class Birtdday {
     static int cakeSlice=20;
    public void takeASlice(){
        cakeSlice--;
    }


    public void takeAslice(int count){
        cakeSlice-=count;

    }

}
class main2{
    public static void main(String[] args) {
        Birtdday zafer=new Birtdday();
        Birtdday enes=new Birtdday();
        Birtdday ilyas=new Birtdday();
        Birtdday ihsan=new Birtdday();
        Birtdday bahar=new Birtdday();
        Birtdday beytullah=new Birtdday();


        zafer.takeASlice();
        enes.takeASlice();
        ilyas.takeASlice();
        ihsan.takeASlice();
        bahar.takeASlice();
        beytullah.takeAslice(2);

        System.out.println(Birtdday.cakeSlice);
   //     System.out.println(ilyas.cakeSlice);

    }

        }