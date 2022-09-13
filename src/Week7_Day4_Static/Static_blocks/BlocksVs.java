package Week7_Day4_Static.Static_blocks;

public class BlocksVs {
    static int i=10;

    public BlocksVs(int i) {
        System.out.println("constructor is working");

    }
    static {
        System.out.println("static block is working");
        i*=10;
        System.out.println(i);
    }
    {
        System.out.println("instance block is working");
    }

}
