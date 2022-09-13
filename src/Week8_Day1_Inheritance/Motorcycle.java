package Week8_Day1_Inheritance;

public class Motorcycle extends Vehicle{
    int cc;
    public int changeCcHp(){
        return cc/15;
    }

    public void start(){
        System.out.println("motor anahtar ile çalıştırıldı.");
    }
}
