package Week8_Day1_Inheritance;

public class Cat extends Animal{
    int foodCount;
    boolean isNankor;

    public Cat(int foodCount, String color,boolean isNankor){
        super(foodCount,color);
        this.isNankor=isNankor;// bunuda verebilirzi zorunlu değil

    }

    public void catMethaod1(){
        super.ses();// constructor da super ile çağırılabilir
        foodCount=5; // yukarıdaki foodcountu alır
    }


    public void catMethaod2(int foodCount){
        foodCount=5; // hemen üstteki foodcountu alır
    }

    public void catMethaod3(int foodCount){
        super.foodCount=5; // animal daki foodcountu alır
    }

    public void talk(){
        System.out.println("miyav miyav");
    }

    public int speed(){
        return 20;

    }




}
