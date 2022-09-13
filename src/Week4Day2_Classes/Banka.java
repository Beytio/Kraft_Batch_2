package Week4Day2_Classes;

import java.util.Random;
import java.util.Scanner;

public class Banka {
    int hesapNo;
    String musteriAdı;
    double paraMiktari;
    boolean mobilBankacilik;

    public void hesapAc(){
        Scanner scan=new Scanner(System.in);
        System.out.println("İsim: ");
        musteriAdı=scan.nextLine();

        Random random=new Random();
        hesapNo=random.nextInt(100000);

        System.out.println(musteriAdı+" "+hesapNo+ " nolu hesabınız başarı ile açılmıştır");
    }

    public void setMobilBankacilik(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Mobil bankcılık kullanmak için lütfen yazınız? ");
        String onay=scan.next();
    if(onay.equals("evet")|| onay.equals("Evet")||onay.equals("EVET")){
        mobilBankacilik=true;
        System.out.println("sayın "+ musteriAdı+" mobil bankacılık kullanabilirsiniz");
    }else{
        System.out.println("sayın"+ musteriAdı+" mobil bankacılığa giriş yapamazsınız");
    }




    }

    public void paraYatir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ne kadar para yatırmak istiyorsunuz ");
        double para= scan.nextDouble();
        paraMiktari+=para;
    }


    public void hesapOzeti(){
        System.out.println(musteriAdı+ " hesabınızda "+ paraMiktari+ " TL para vardır");
    }
}
