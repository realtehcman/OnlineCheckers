package com.practice;
/*
Given a two-dimensional array of integers, return the flattened version of the array with all the
integers in the sorted (ascending) order.

Example:
Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
*/

//HELPFUL:
// https://www.youtube.com/watch?v=sVX421gaRT4

import org.jetbrains.annotations.NotNull;

import java.util.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    
    public static int @NotNull [] flattenAndSort(int[][] array){
        ArrayList<Integer> arrayList =
                Stream.of(array)
                        .flatMapToInt(IntStream::of)
                        .sorted()
                        .collect(ArrayList<Integer>::new, ArrayList<Integer>::add, ArrayList<Integer>::addAll);
        
        int[] arrayOutput = new int[arrayList.size()];
        for(int i = 0; i < arrayOutput.length; i++){
            arrayOutput[i] = arrayList.get(i);
        }
        
        return arrayOutput;
    }
}

//BEST PRACTICE:
/*
*   public static int[] flattenAndSort(int[][] array) {
    return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
  }
*/
