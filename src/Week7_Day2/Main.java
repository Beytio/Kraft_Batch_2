package Week7_Day2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Square square1=new Square();
//        square1.sideLenght=8;
//        System.out.println(square1.calculateArea());
//        System.out.println(square1.calculatePerimeter());
//
//
//        Square square2=new Square(5);
//
//        System.out.println(square2.calculateArea());
//        System.out.println(square2.calculatePerimeter());
//
//
//        Pencil Pencil1=new Pencil();
//        Pencil Pencil2=new Pencil("sari");
//        Pencil Pencil3=new Pencil("kırmızı",15);
//        Pencil Pencil4=new Pencil("pebme",21,true);
//
//
//        System.out.print("  "+Pencil1.color);
//        System.out.print("  "+Pencil1.lenght);
//        System.out.println("  "+Pencil1.haveEraser);
//
//
//
//        System.out.print("  "+Pencil2.color);
//        System.out.print("  "+Pencil2.lenght);
//        System.out.println("  "+Pencil2.haveEraser);
//
//        System.out.print("  "+Pencil3.color);
//        System.out.print("  "+Pencil3.lenght);
//        System.out.println("  "+Pencil3.haveEraser);
//
//
//        System.out.print("  "+Pencil4.color);
//        System.out.print("  "+Pencil4.lenght);
//        System.out.println("  "+Pencil4.haveEraser);
//
//
//        Pencil1.write();
//        Pencil2.delete();
//        Pencil4.delete();


        KraftBank customer1=new KraftBank (1235,"Beytullah Oğuz",true);
        System.out.println(customer1.customerId);
        System.out.println(customer1.customerFullName);
        System.out.println(customer1.isSms);
        System.out.println(customer1.customerToken);


        customer1.addMoney(500000000);
        System.out.println(customer1.customerAccount);
        customer1.addMoney(51);
        System.out.println(customer1.customerAccount);


        changeFullName(customer1, "Enes Torlak");
        System.out.println(customer1.customerFullName);
        System.out.println(customer1.customerToken);

    }

    public static KraftBank changeFullName(KraftBank customer1,String fullName){
        customer1.customerFullName=fullName;
        return customer1;
    }





}
