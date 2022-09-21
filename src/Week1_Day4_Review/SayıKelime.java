package Week1_Day4_Review;

public class SayıKelime {

    public static void main(String[] args) {
        String girilenBilgi = "65"; // şu haliyle ahet gibi bir kelimedir. sayısal işleme giremez
        int girilenSayi = 65;

        // Kelimenin sayıya çevrilmesi
        int girilenBilgininSayiHali = Integer.parseInt(girilenBilgi); // dönüşecek tipe uygun dönüşüm
        short shortDeger = Short.parseShort(girilenBilgi);

        double oran = Double.parseDouble(girilenBilgi);

        System.out.println(girilenBilgininSayiHali);
        System.out.println(shortDeger);
        System.out.println(oran);

        // Sayının kelimeye çevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // değişiikenin tipine uygun dönüşüm
        String kelimeOran = Double.toString(oran);

        System.out.println(girilenSayininKelimeHali);
        System.out.println(kelimeOran);




        short sayi= 345;
        String strSayi = Short.toString(sayi);

        System.out.println("strSayi = " + strSayi);
    }
}
