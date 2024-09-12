package org.example.e131;

public class E131StaticKeyword {
    public static String thirdLetter(String s){
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < s.length(); i+=3) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));
    }
}
