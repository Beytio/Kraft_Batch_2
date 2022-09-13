package Week8_Day2;

import java.util.Random;

public class Person {
    String name;
    String surname;
    int id;
    double salary;


    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname=surname;
    }

    public void createId(){
        Random random=new Random();
        this.id= random.nextInt(0,100);
    }

}
