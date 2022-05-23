package com.practice;

import java.util.ArrayList;

public class FakeBinary {
    private static final ArrayList<Integer> resultArr = new ArrayList<>();
    
    public static String fakeBin(String numberString){
        parsing(numberString);
        selectingBinary();
        
        String temp = resultArr.toString().replaceAll("\\D", "");
        resultArr.clear();
        
        return temp;
    }
    
    static void parsing(String input){
        for(int i = 0; i < input.length(); i++){
            resultArr.add(Integer.parseInt(input.substring(i, i + 1)));
        }
    }
    
    static void selectingBinary(){
        for(int i = 0; i < resultArr.size(); i++){
            if(resultArr.get(i) < 5) resultArr.set(i, 0);
            else resultArr.set(i, 1);
        }
    }
    
    public static void main(String[] args){
        System.out.println(fakeBin("509321967506747"));
    }
}

//Alternative solution
class FakeBinary2 {
    public static String fakeBin(String numberString){
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}