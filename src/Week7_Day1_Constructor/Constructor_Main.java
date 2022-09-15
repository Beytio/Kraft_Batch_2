package Week7_Day1_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {

//        Flower flower=new Flower("sarı",35,true);
//        System.out.println(flower.renk);
//        flower.renk="kırmızı";
//        System.out.println(flower.renk);
//
//
//        flower.setrenk("sarı");
//        System.out.println(flower.renk);

//        System.out.println(flower.renk);
//        System.out.println(flower.boy);
//        System.out.println(flower.diken);
//
//        Flower flower1=new Flower("kırmızı");
//        Flower flower2=new Flower("sarı",56);
//        Flower flower3=new Flower("pembe",89,true);
//        Flower flower4=new Flower();
//        System.out.println(flower1.boy);
//        System.out.println(flower1.renk);
//        System.out.println(flower1.diken);
//
//
//        System.out.println(flower2.boy);
//        System.out.println(flower2.renk);
//        System.out.println(flower2.diken);
//
//        System.out.println(flower3.boy);
//        System.out.println(flower3.renk);
//        System.out.println(flower3.diken);
//
//
//        System.out.println(flower4.boy);
//        System.out.println(flower4.renk);
//        System.out.println(flower4.diken);

        Okul okul1=new Okul();
        Okul okul2=new Okul("sari");
        Okul okul3=new Okul("kırmız",520);
        Okul okul4=new Okul("yeşil",490,16);

        System.out.print("   "+okul1.kapasite);
        System.out.print("   "+okul1.renk);
        System.out.println("   "+okul1.sinifadedi);

        System.out.print("   "+okul2.kapasite);
        System.out.print("   "+okul2.renk);
        System.out.println("   "+okul2.sinifadedi);

        System.out.print("   "+okul3.kapasite);
        System.out.print("   "+okul3.renk);
        System.out.println("   "+okul3.sinifadedi);

        System.out.print("   "+okul4.kapasite);
        System.out.print("   "+okul4.renk);
        System.out.println("   "+okul4.sinifadedi);

        okul3.kontrolKapasite();
        okul2.kontrolKapasite();
        okul4.kontrolKapasite();

        Okul kanuni=new Okul("pembe",550);
        System.out.println(kanuni);
        System.out.println(kanuni.kapasite);

    }
}
