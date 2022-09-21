package Week8_Day5_Interface;

public interface A {
    int num=10;

    void M1();// bunu compyler default abstract olarak atar.
    void M2();// bunu compyler default abstract olarak atar.
    void M3();// bunu compyler default abstract olarak atar.
    void M4();// bunu compyler default abstract olarak atar.
                // overrişde edilmeli


    default void M5(){   // overide edilmesi gerekmez abstract değil

    }

    static void M6(){

    }

}
