package Week8_Day1_Inheritance;

public class VanKedisi extends Cat{
    boolean isDifferentEyes;
    public VanKedisi(int foodCount, String color, boolean isNankor){
        super(foodCount, color, isNankor);

    }

    public VanKedisi(int foodCount, String color, boolean isNankor,boolean isDifferentEyes){
        super(foodCount, color, isNankor);
        this.isDifferentEyes=isDifferentEyes;

    }
}
