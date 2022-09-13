package Week7_Day4_Static;

public class Candidate {
    String name;
    int SchoolId;

    static String branch="java";
    static int counter;

    public Candidate(String name) {
        this.name = name;
        SchoolId = setNumber();
    }
public static int setNumber(){
        counter++;
        return counter;
}

public static void setBranch(String str){
        branch=str;
}

public void getInfo(){
    System.out.println(name);
    System.out.println(SchoolId);
    System.out.println(branch);
    Candidate.setBranch("sellenium");
}

}

class main7{
    public static void main(String[] args) {
        Candidate cd1=new Candidate("beytullah");
        Candidate cd2=new Candidate("alparslan");
        Candidate cd3=new Candidate("ihsan");
        Candidate cd4=new Candidate("enes");

        cd1.getInfo();
        cd2.getInfo();
        cd3.getInfo();
        cd4.getInfo();

    }
}