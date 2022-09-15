package Week2_Day1_;

import java.util.Scanner;

public class AritmetikOperatorler {
    public static void main(String[] args) {

        // 1 bit 0 veya 1
        // 2 bit 00 01 10 11
//        int sayi =20/5;
//        System.out.println(sayi);
//        int sayi2=5+20/5;
//
//int sayi3=3+5/2*4%(12-9);
//System.out.println(sayi3);
//  int sayi_4 = 31502%60;
//    int sayi_5=31502/60;
//    System.out.println(sayi_5 + " saat " + sayi_4 + " dakika ");
//System.out.println(".............");
/*
byte a=10;
byte b=5;
byte c;
c=(byte)(a+b);
System.out.println(c);
        System.out.println(".............");
int x=5, y=6,z;
z=y%x;
System.out.println(z);

        System.out.println(".............");
int sayi8=3+5/2*4%(12-9);
System.out.println(sayi8);

        System.out.println(".............");
        int ali=1990, yıl=2022;
        int yaş= yıl-ali;
        System.out.println(yaş);

        System.out.println(".............");
        int ahmet= yaş -5;
        System.out.println(ahmet);

        System.out.println(".............");

int r=2;
final double pi=3.14;
double alan, çevre;
alan=pi*r*r;
System.out.println("alan = "  + alan);
çevre= 2*pi*r;
System.out.println("çevre2 = "+  çevre);

        System.out.println(".............");
int f=300;
double sıcaklık;
sıcaklık = (f-32)/1.8;
System.out.println(sıcaklık);

double fizik,kimya,matematik;
 fizik=92;
 kimya=55;
 matematik =89;
 matematik=50;
 matematik=0;
double ortalama;
ortalama=(fizik+kimya+matematik)/3;
System.out.println(ortalama);
boolean sonuç=80< ortalama;
System.out.println(sonuç);
        int katılan;
        katılan=113;
int sıra, koltuk, kapasite, boşkoltuk;
sıra=15;
koltuk=12;
kapasite=sıra*koltuk;
System.out.println("kapasite =" +kapasite);
boşkoltuk=kapasite-katılan;
        System.out.println("boşkoltuk= "+boşkoltuk);
int oturulan, boşsıra;
oturulan = katılan/12+1;
System.out.println("oturulan sıra = "+oturulan);
boşsıra=sıra-oturulan;
System.out.println("toplam boş sıra = "+boşsıra);
int boşkoltuk1;
boşkoltuk1=12-113%12;
System.out.println("orurulan sıralardaki  boş koltuk =" +boşkoltuk1);


int saat, dakika, değer, saniye;
değer=31502;
saat=31502/3600;
dakika=değer/60%60;
saniye=31502%60;
System.out.println(saat + " saat " + dakika + " dakika "+ saniye +" saniye ");
*/
        Scanner scan = new Scanner(System.in);
    /*    System.out.print("Lütfen bir kelime yazınız: ");
        String text= scan.nextLine();
        System.out.println(" Girilen kelime: " + text);

        System.out.print("Lütfen bir sayı yazınız: ");
        int sayı= scan.nextInt();
        System.out.println(" Girilen sayı: " + sayı);

        System.out.print("Lütfen bir sayı yazınız: ");
        double sayı1= scan.nextDouble();
        System.out.println(" Girilen sayı: " + sayı1);*/

       /* System.out.print("İsminiz:  ");
        String ad= scan.nextLine();
        System.out.print(" Doğum yılınız ");
        int yıl=scan.nextInt();
        System.out.println(ad +" bay/bayan " +(2022-yıl) +" yaşındadır.");*/
/*System.out.print("Fizik: ");
double fiz= scan.nextDouble();
System.out.print("Kimya: ");
double kim= scan.nextDouble();
        System.out.print("Matematik: ");
        double mat= scan.nextDouble();
        double ort=(mat+kim+fiz)/3;
        System.out.println("Ortalama = "+ ort);/*

 *



     //   ÖDEV1

  final double pi=3.14;
        System.out.print("Yarıçap: ");
        double yarıçap=scan.nextDouble();
        double alan= yarıçap*yarıçap*pi;
        double çevre=yarıçap*2*pi;
        System.out.println("Alan= "+alan);
        System.out.println("Çevre = "+çevre);

//        ödev2
*/
        System.out.print("Fahrenheit: ");
        double fahr =scan.nextDouble();
        double cel= (fahr-32)/1.8;
        System.out.println("Celcıus değeri :"+cel);

        System.out.print("Quız: ");
        Double quız=scan.nextDouble();
        System.out.print("Yarı Final: ");
        Double yarıfınal=scan.nextDouble();
        System.out.print("Final : ");
        Double Finalnotu=scan.nextDouble();
        Double ortalama=quız*0.2+yarıfınal*0.3+Finalnotu*0.5;
        System.out.println("Yıl sonu not= "+ortalama);

          System.out.print("Solondaki sıra sayısı:  ");
          int sira=scan.nextInt();
          System.out.print("Her sıradaki koltuk sayısı: ");
          int koltuk=scan.nextInt();
          System.out.print("Katılan kişi sayısı: ");
          int katilan=scan.nextInt();
          int kapasite=sira*koltuk;
          int boskoltuk=kapasite-katilan;
          int oturulan_sira= katilan/koltuk+1;
          int bos_sira=sira-oturulan_sira;
          int oturulansirakiboskoltuk=koltuk-(katilan%koltuk);
          System.out.println("Kapasite = "+kapasite);
          System.out.println("Boş koltuk sayısı = "+boskoltuk);
          System.out.println("Oturulan sıra sayısı = "+oturulan_sira);
          System.out.println("Tamamen boş kalan sıra sayısı = "+bos_sira);
          System.out.println("Oturulan sıradaki boş koltuk sayısı = "+oturulansirakiboskoltuk);




}
}
