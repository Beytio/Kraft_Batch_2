package Week6_Day4_Wrapper;

public class WrapperClass_Task {
    public static void main(String[] args) {

//
////        TASK 1
//        String str = "^+!j4546*/-a_|v-:!a ???()&+";
//        String strempty="";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isAlphabetic(str.charAt(i))) {
//                strempty+=str.charAt(i);
//            }
//
//        }
//        System.out.println("strempty = " + strempty);
//
//
//
//
////        tassk2
//
//        String str2 = "|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*>" +
//                "<###a678* +%&&/))<+J>>>>**56a##v**||;;;~~a~" +
//                ">>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%" +
//                "%n**-<<|||>>0123456l79--a**//##++34r``~~((ı[234]+||";
//        String strempty2=" ";
//
//        for (int i = 0; i < str2.length(); i++) {
//            if (Character.isLetter(str2.charAt(i))||str2.charAt(i)==' ') {
//                strempty2+=str2.charAt(i);
//            }
//
//        }
//        System.out.println("strempty2 = " + strempty2);



        String str="A number is a mathematical object used to count, measure, and label. The origina" +
                "l examples are the natural numbers 1, 2, 3, 4, and so forth";

        String strempty5="";
        int sum=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                strempty5+=str.charAt(i);
               sum+= Integer.parseInt(str.charAt(i)+"");
            }

        }
        System.out.println("strempty2 = " + strempty5);
        System.out.println("sum = " + sum);


    }
}
