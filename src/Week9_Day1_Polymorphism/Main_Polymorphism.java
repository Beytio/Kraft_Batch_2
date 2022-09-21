package Week9_Day1_Polymorphism;

public class Main_Polymorphism {
    public static void main(String[] args) {
//        Animal karabas =new Dog();
//        karabas.voice();

//        SportCar car1= new SportCar();
//        car1.start();
//        car1.stop();
//        System.out.println(car1.isCabrio);
//
//        IVehicle car2=new SportCar();
//        car2.durmaMesafesi();
//        car2.start();// burayı sport car sınıfından override edildiği için
//        car2.stop();// burayı car sınıfından kullanır


        Animal animal=new Dog();

        Dog dog=(Dog) animal;
        dog.eat();
        dog.voice();

    }
}
