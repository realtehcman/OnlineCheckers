package com.practice;
/*Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
Write a function which takes a list of strings and returns each line prepended by the correct number.
The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples:
number(Arrays.asList()) # => []
number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>(); //List Interface
        myList.add("a");
        myList.add("b");
        myList.add("c");

        List<String> updatedList = LineNumbering.number(myList);

        for(String i : updatedList) {
            System.out.println(i);
        }
    }
}

/*We are using the list interface here. more:
* https://www.geeksforgeeks.org/list-interface-java-examples/
*/
