package com.codewars.kyu8.willThereBeEnoughSpace;

/**
 * <h2>The Story:</h2>
 * Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so
 * many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left
 * on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.
 * <p>
 * <h2>Task Overview:</h2>
 * You have to write a function that accepts three parameters:
 * <p>
 * cap is the amount of people the bus can hold excluding the driver.<br/>
 * on is the number of people on the bus excluding the driver.<br/>
 * wait is the number of people waiting to get on to the bus excluding the driver.<br/>
 * If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
 * <p>
 * <h2>Usage Examples:</h2>
 * cap = 10, on = 5, wait = 5 --> 0 # He can fit all 5 passengers<br/>
 * cap = 100, on = 60, wait = 50 --> 10 # He can't fit 10 of the 50 waiting
 */
public class Bob {
    public static int enough(int cap, int on, int wait) {
        int result = on + wait - cap;
        return Math.max(result, 0);
    }
}
