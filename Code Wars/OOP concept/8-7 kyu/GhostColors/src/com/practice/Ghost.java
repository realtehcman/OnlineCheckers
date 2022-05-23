package com.practice;
import java.util.Random;

public class Ghost {
    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        ghost.getColor();
    }

    String getColor() {
        String[] color = {"white", "yellow", "purple", "red"};
        Random rand = new Random();
        return color[rand.nextInt(4)];
    }
}