package Week7_Day3_Encapsulation;

public class Dog {
    private String name;
    private String breed;
    private boolean isBlack;
    private int age;
    private double speed;
    public static int foot=4;





    public Dog() {
    }



    public double getSpeed(){
        return this.speed*1.6;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getBreed() {

        return this.breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }

    public boolean isBlack() {

        return this.isBlack;
    }

    public int getAge() {

        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }




}
