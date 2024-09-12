package org.example.e135;

public class E135StaticKeyword {
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c"));
        System.out.println(surround("technology", "o"));
    }
    public static String surround(String s,String search_term){
        if (search_term.length()!=1){
            throw new IllegalArgumentException("Search term should be single character");
        }
        char term=search_term.charAt(0);
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (s.charAt(i)==term){
                result.append('(').append(term).append(')');
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}

