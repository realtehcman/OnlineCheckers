package com.practice;

public class Block {
    private int[] parameters;

    public Block(int[] info) {
        this.parameters = info;
    }

    public int getWidth() {
        return parameters[0];
    }

    public int getLength() {
        return parameters[1];
    }

    public int getHeight() {
        return parameters[2];
    }

    public int getVolume() {
        return getHeight() * getLength() * getWidth();
    }

    public int getSurfaceArea() {
        return (2*((getWidth() * getLength()) + (getHeight() * getLength()) + (getWidth() * getHeight()))); //formula SA=2lw+2lh+2hw
    }
}
