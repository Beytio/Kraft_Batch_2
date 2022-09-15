package Week4_Day1;

public class Review {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println(" 2 sayı giriniz");
//        int sayi = scan.nextInt();
//        int sayi2 = scan.nextInt();
//        System.out.println("digitnumber"+digitNumber(sayi));
//    armstrongTreeDigitis(100,999);
//fibonachi(15);


        System.out.println(ebob(2000000000, 108));
        System.out.println(minimumSayi(5, 589));

    }
//    Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız

//    public static int digitNumber(int sayi) {
//        int digit = 0;
//        while (sayi > 0) {
//            sayi /= 10;
//            digit++;
//        }
//        return digit;
//    }


  /*  public static int uslu(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++)
            sonuc *=taban;
    }
        return sonuc;




   */


    public static void armstrongTreeDigitis(int start, int end){
        for(int i=start;i<=end; i++){
            int x,y,z,sonuc;
             x=i/100;
             y=i%100/10;
             z=i%10;
             sonuc=x*x*x+y*y*y+z*z*z;
             if (i==sonuc){
                 System.out.print(sonuc+ " ");
             }

        }
    }


//ullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 24



    public static void fibonachi(int adet){
        int x=0,y=1,z;
        System.out.print(x+" "+y);
        for (int i=2;i<adet; i++){
            z=y+x;
            System.out.print(" "+z);
            x=y;
            y=z;
        }

    }
// kullanıcıdan iki sayı alın ebob bul

    public static int ebob(int a,int b){
        int sonuc=1;
        for (int i=1;i<=a; i++){
            if (a%i==0&&b%i==0){
                sonuc=i;
            }
        }
        return sonuc;
    }

    public static int minimumSayi (int a, int b){
//    if(a>b){
//         return b;
         int minimum =(a>=b)?a:b;
         return minimum;

//    }
//    else{
//        return a;

    }




}

