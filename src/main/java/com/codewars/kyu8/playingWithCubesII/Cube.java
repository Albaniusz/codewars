package com.codewars.kyu8.playingWithCubesII;

public class Cube {

    public Cube() {
    }

    public Cube(int side) {
        this.side = Math.abs(side);
    }

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = Math.abs(side);
    }

}
