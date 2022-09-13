package Week7_Day3_Encapsulation;

import Week7_Day2.KraftBank;

public class Main {
    public static void main(String[] args) {
/*
        Dog karabas=new Dog();
        System.out.println(karabas.getName());
        karabas.setName("karabas");
        System.out.println(karabas.getName());
        karabas.setName("boncuk");
        System.out.println(karabas.getName().substring(0, 2).toUpperCase());
        System.out.println(karabas.getAge());
        karabas.setAge(5);
        System.out.println(karabas.getAge());
        karabas.setAge(15);
        System.out.println(karabas.getAge());
        karabas.setSpeed(100);
        System.out.println(karabas.getSpeed());

        */

        Circle circle1=new Circle(8);
        Circle circle2=new Circle(9);


//        System.out.println(circle1.calculateArea());
//
//
//        System.out.println(circle1.getRadius());
//        System.out.println(Math.PI * Math.pow(circle1.getRadius(), 2));
//
//        System.out.println(circle1.calculateArea(8));
//        System.out.println(circle1.getRadius());
//        circle1.calculateArea();
//
//        Dog.foot=5;
//        System.out.println(Dog.foot);

        KraftBank enes=new KraftBank(1236,"enes yılmaz", false);

        System.out.println(enes.getCustomerToken());
        enes.setCustomerFullName("1236en4051","enes yılar");


    }



    }


