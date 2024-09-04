package com.codewars.kyu6.the80sKids.legendsOfTheHiddenTemple;

/**
 * You've made it through the moat and up the steps of knowledge. You've won the temples games and now you're hunting
 * for treasure in the final temple run. There's good news and bad news. You've found the treasure but you've triggered
 * a nasty trap. You'll surely perish in the temple chamber.
 * <p>
 * With your last movements, you've decided to draw an "X" marks the spot for the next archaeologist.
 * <p>
 * Given an odd number, n, draw an X for the next crew. Follow the example below.
 * <p>
 * markSpot(5) ->
 * <p>
 * X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;X<br/>
 * &nbsp;X&nbsp;&nbsp;&nbsp;X<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;X<br/>
 * &nbsp;&nbsp;X&nbsp;&nbsp;&nbsp;X<br/>
 * X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;X
 * <p>
 * For a clearer understanding of the output, let '.' represent a space and \n the newline.
 * <p>
 * X.......X<br/>
 * ..X...X<br/>
 * ....X<br/>
 * ..X...X<br/>
 * X.......X
 * <p>
 * markSpot(3) ->
 * <p>
 * X&nbsp;&nbsp;&nbsp;X<br/>
 * &nbsp;&nbsp;X<br/>
 * X&nbsp;&nbsp;&nbsp;X
 * <p>
 * If n = 1 return 'X\n' and if you're given an even number or invalid input, return '?'.
 * <p>
 * The output should be a string with no spaces after the final X on each line, but a \n to indicate a new line.
 */
public class EightiesKids4 {
    private final static String S = " ";

    private final static String X = "X";

    public static String markSpot(float n) {
        int intN = (int) n;

        if (n < 0 || n % 2 == 0 || n - intN != 0) {
            return "?";
        }

        StringBuilder sb = new StringBuilder();
        int center = intN / 2;

        for (int i = 0; i < n; i++) {
            int xInRow = 0;
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    sb.append(S);
                }

                if (j == i || j == n - 1 - i) {
                    sb.append(X);
                    xInRow++;

                    if (xInRow >= 2 || j == center && i == center) {
                        break;
                    }
                } else {
                    sb.append(S);
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
