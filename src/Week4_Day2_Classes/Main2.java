package Week4_Day2_Classes;

public class Main2 {



    public static void main(String[] args) {
        DaireNew daire1=new DaireNew();
        daire1.yarıcap=10;

        System.out.println("daire1 = " + daire1.yarıcap);

        DaireNew daire2=new DaireNew();
        daire2.yarıcap=15;
        System.out.println("daire2.yarıcap = " + daire2.yarıcap);
        daire1=daire2;
        daire2.yarıcap=80;
        System.out.println("daire1.yarıcap = " + daire1.yarıcap);
    }
}
