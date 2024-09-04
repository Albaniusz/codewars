package com.codewars.kyu7.wasdMovement;

/**
 * Complete the method public float[] getVector(boolean[] wasd) to calculate the players movement vector resulting from
 * user input to the WASD keys.
 * <p>
 * The method accepts an array of 4 boolean values representing the pressed state of the W, A, S and D keys where
 * true indicates the key is pressed. Any number of keys may be pressed at a time.
 * <p>
 * The method should return a float array of size 2 representing the x any y components of the resulting movement
 * vector where W and S map to positive and negative y respectively and A and D map to negative
 * and positive x respectively.
 * <p>
 * The players should always move at speed 1.
 */
public class GameInput {

    private final float oneOverSqrt2 = (float) (1 / Math.sqrt(2));

    public float[] getVector(boolean[] wasd) {
        float x = 0;
        float y = 0;

        x += (wasd[1] ? -1 : 0) + (wasd[3] ? 1 : 0);
        y += (wasd[0] ? 1 : 0) + (wasd[2] ? -1 : 0);

        if (x != 0 && y != 0) {
            x = oneOverSqrt2 * x;
            y = oneOverSqrt2 * y;
        }

        return new float[]{x, y};
    }
}
