package com.digital.baha;

public class StartWord {
    public static void main(String[] args) {
        System.out.println(startWord("hippi", "zip"));
    }
    public static String startWord(String str, String word) {

        if(str.length()>0 && str.substring(1).startsWith(word.substring(1))){
            return str.substring(0,word.length());
        }
        return "";
    }

}
