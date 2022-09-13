package Week7_Day4_Static.Static_blocks;

public class staticInit {
    static final int age;
    static final int weight;
    static {            // önce bura çalışoror sonra yukarı
                            // çıkıyor onun için hata vermiyor
        age=20;
        weight=85;
    }



}
