package Week8_Day1_Inheritance;

import Week8_Day2.Fabrika;

public class Vehicle extends Fabrika {


    protected int model;
    int speed;
    static String color;

    public void start(){

        System.out.println("Araç çalıştırıldı.");
    }
    public void stop(){
        System.out.println("Araç durduruldu.");
    }
}
