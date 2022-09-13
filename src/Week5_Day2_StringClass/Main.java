package Week5_Day2_StringClass;

public class Main {


//    public static String shortLongShort(String str1, String str2) {
//        String result = "";
//        if (str1.length() < str2.length()) {
//            for (int i = 0; i < 2; i++) {
//                result += str1 + str1;
//                for (int j = 0; j < 30; j++) {
//                    if (i == 1) {
//                        break;
//                    } else {
//                        result += str2;
//                    }
//                }
//            }
//            return result;
//        } else {
//
//            for (int i = 0; i < 2; i++) {
//                result += str2 + str2;
//                for (int j = 0; j < 30; j++) {
//                    if (i == 1) {
//                        break;
//                    } else {
//                        result += str1;
//                    }
//                }
//            }
//            return result;
//        }
//
//
//    }
//
//
//
//
//    public static String nokta(String str){
//    if(str.length()>=5){
//        return str.substring(0,5);
//    }else{
//        String result="";
//        for (int i = 0; i < 5-str.length(); i++) {
//
//            result+=".";
//        }
//        return str.concat(result);
//    }
//    }
//
//
//    public static boolean twoLetterEnd(String str){
//        String str1=str.toLowerCase();
//        return str.substring(0,2).equals(str1.substring(str1.length()-2));
//
//    }




    
    public static String soyad(String str){

        String str1=str.trim();
        return str1.substring(str1.lastIndexOf(" ")+1);

    }

    public static String soyad2(String str){
        String str1=str.trim();
        int count=0;
        for (int i = 0; i < str1.length(); i++) {
            if(str.charAt(i)==' '){
                count=i;
            }

        }
        if(count==0){
            return "";
        }else{
            return str.substring(count+1);
        }
    }





    public static String yenilenen(String str){
        String result="";

        for (int i = 0; i < str.length();) {
            result+=str.charAt(i);
            str=str.replace(str.substring(i,i+1), "");

            }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(yenilenenler("merhabababhame"));
        System.out.println(rakamBul("jkdkjlsfds152dfssdjhdsj555"));
    }

    public static String yenilenenler(String str) {
        String str1=str.replace(" ","");
        String result="";
        while (!str1.isEmpty()){
            if(str1.substring(1).contains(str1.substring(0,1))){
                result+=str1.substring(0,1);
            }
            str1=str1.replace(str1.substring(0,1),"");
        }
return result;

    }


    public static String rakamBul(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)>47&&str.charAt(i)<58){
            result+=str.charAt(i);
        }

        }
        return result;



    }


}
