package com.practice;

/*A spoonerism is a spoken phrase in which the first letters of two of the words are swapped around, often with amusing results.

In its most basic form a spoonerism is a two word phrase in which only the first letters of each word are swapped:

"not picking" --> "pot nicking"
*/
public class Spooner {
    public String spoonerize(String words) {
        char letter1 = words.charAt(0);
        System.out.println(letter1);

        char letter2;
        char[] charArray = new char[words.length()];

        for(int i = 0; i < words.length(); i++) {
            charArray[i] = words.charAt(i);
        }
        for(int i = 0; i < words.length(); i++) {
            if(charArray[i] == ' ') {
                letter2 = charArray[i + 1];
                charArray[0] = letter2;
                charArray[i + 1] = letter1;
            }
        }
        String string = String.copyValueOf(charArray);
        return string;
    }
}

/*public class Spooner {

public class Spooner {

    public String spoonerize(String words) {
        String[] word = words.split(" ");
        return word[1].substring(0, 1) + word[0].substring(1) + " " + word[0].substring(0, 1) + word[1].substring(1);
    }

}
}*/