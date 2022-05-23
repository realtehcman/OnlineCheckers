package com.practice;

public class PasswordHider {
    public static String hidePasswordFromConnection(String urlString) {
        StringBuilder ans = new StringBuilder(urlString);
        for (int i = ans.indexOf("password")+9; i < urlString.length() && ans.charAt(i) != '&'; i++){ //+9 because indexOf Returns the index within this string of the first occurrence of the specified substring
            ans.setCharAt(i, '*');
        }
        return ans.toString();
    }
}