package Week8_Day2;

public class Fabrika {
    String personelAdi;
    boolean isActive;
    private int num;

    public Fabrika(){
    }

    public Fabrika(String personelAdi){
        this.personelAdi =personelAdi;
    }

    public Fabrika(String personelAdi,boolean isActive){
        this.personelAdi =personelAdi;
        this.isActive=isActive;
    }

    public Fabrika(String personelAdi,boolean isActive,int num){
        this.personelAdi =personelAdi;
        this.isActive=isActive;
        this.num=num;
    }


//    public void setNum(int num){
//    if(num<0){
//    System.out.println("pozitif değer girniz");
//    }else{
//    this.num=num*10;
//}
//    }
//
//
//    public int getNum(){
//        return num;
//    }





    public void firstMetot(){
        System.out.println("first method");
    }



}
