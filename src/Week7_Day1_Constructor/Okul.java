package Week7_Day1_Constructor;

public class Okul {

    public String renk;
    public int kapasite;
    public int sinifadedi;

    public void  kontrolKapasite(){
        if (this.kapasite>500){
        System.out.println("kapsite aşılmıştır");
    }else{
            System.out.println("kapasite aşılmasına " + (500- this.kapasite) + " kişi kalmıştır");
        }
    }


    public Okul(){
        System.out.println("parametresiz");

    }

    public Okul(String renk){
        this();
        System.out.println(" 1 parametreli");
        this.renk=renk;

    }

    public Okul(String renk,int kapasite){
       this("pembe",450,45);
        System.out.println(" 2 parametreli");
        this.kapasite=kapasite;

    }
    public Okul(String renk,int kapasite,int sınıfadedi){
        this.renk=renk;
        this.kapasite=kapasite;
        this.sinifadedi=sınıfadedi;


    }

}
