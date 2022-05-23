package com.practice;


public class Main {

    public static void main(String[] args){
        SpinWords obj = new SpinWords();
        System.out.println(obj.spinWords("I love bananas and apples"));
    }
}

class SpinWords {
    public String spinWords(String sentence){
        String[] parsed = sentence.split(" ");

        for(int i = 0; i < parsed.length; i++){
            if(parsed[i].length() >= 5){
                parsed[i] = new StringBuilder(parsed[i]).reverse().toString();
            }
        }
        return String.join(" ", parsed); // ?returning String
    //    https://www.geeksforgeeks.org/java-string-join-examples/
    }
}