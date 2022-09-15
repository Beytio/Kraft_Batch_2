package Week8_Day3_FinalandHiding;

public class Main_FinalandHiding {

//    Aynı paketteki farklı claslardan değişken protected olsa da çağrılabilir
//    public void start(){
//        Parent parent=new Parent();
//        System.out.println(parent.num);

    public static void main(String[] args) {
//        Parent parent = new Parent();
//      constructor private olursa obje oluşturulamaz

        Parent beytullah=new Parent();
        beytullah.run();

        beytullah.num=4;
        System.out.println(beytullah.num);

        Child melek=new Child();
        melek.run();

        melek.num=5;
        System.out.println(melek.num);


    }
}
