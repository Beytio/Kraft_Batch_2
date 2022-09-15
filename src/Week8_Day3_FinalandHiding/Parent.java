package Week8_Day3_FinalandHiding;

public class Parent {    // final class olsaydı child
                            // olur ama parent olmazdı
    protected int num=100;
//    static int x=0;
//
//    {
//        x++;
//        System.out.println("instance method is working");
//    }
//
//    {
//        System.out.println("instance2 method is working");
//    }
//
//    static {
//
//        System.out.println("Static method is working");
//
//    }
//
//
//     Parent(){
//        System.out.println("Constructor method is working");
//    }



    public void run(){   // final olursa override edilmeez
        System.out.println("parent runs");
    }

}
