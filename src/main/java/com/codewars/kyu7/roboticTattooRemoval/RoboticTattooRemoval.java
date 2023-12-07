package com.codewars.kyu7.roboticTattooRemoval;

import java.util.stream.Stream;

/**
 * <img src="https://media.timeout.com/images/102748305/image.jpg"/>
 * <p>
 * Sometimes people get tattoos, sometimes they wish they hadn't, sometimes the tattoos must go. Lets create
 * a robot that can remove tattoos.
 * <p>
 * Your robot function accepts one array argument called skinScan. I have supplied an example array below.
 * <p>
 * [<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],<br/>
 * [' ',' ','X','X',' ',' ',' ','X','X',' ',' '],<br/>
 * [' ','X',' ',' ','X',' ','X',' ',' ','X',' '],<br/>
 * [' ','X',' ',' ',' ','X',' ',' ',' ','X',' '],<br/>
 * [' ','X',' ',' ',' ','X',' ',' ',' ','X',' '],<br/>
 * [' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],<br/>
 * [' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],<br/>
 * [' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],<br/>
 * [' ',' ','X',' ',' ',' ',' ',' ','X',' ',' '],<br/>
 * [' ',' ',' ','X',' ',' ',' ','X',' ',' ',' '],<br/>
 * [' ',' ',' ',' ','X',' ','X',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']<br/>
 * ]
 * <p>
 * Your task is to create a function for the robot function that will zap away the Xs and replace them with *s. Any
 * array values that are not Xs must be left alone. Below is what skinScan should look like after the tattoo has
 * been removed.
 * <p>
 * [<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],<br/>
 * [' ',' ','*','*',' ',' ',' ','*','*',' ',' '],<br/>
 * [' ','*',' ',' ','*',' ','*',' ',' ','*',' '],<br/>
 * [' ','*',' ',' ',' ','*',' ',' ',' ','*',' '],<br/>
 * [' ','*',' ',' ',' ','*',' ',' ',' ','*',' '],<br/>
 * [' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],<br/>
 * [' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],<br/>
 * [' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],<br/>
 * [' ',' ','*',' ',' ',' ',' ',' ','*',' ',' '],<br/>
 * [' ',' ',' ','*',' ',' ',' ','*',' ',' ',' '],<br/>
 * [' ',' ',' ',' ','*',' ','*',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],<br/>
 * [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']<br/>
 * ]
 */
public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        return Stream.of(skinScan)
            .map(a -> Stream.of(a)
                .map(s -> "X".equals(s) ? "*" : s)
                .toArray(String[]::new))
            .toArray(String[][]::new);
    }
}
