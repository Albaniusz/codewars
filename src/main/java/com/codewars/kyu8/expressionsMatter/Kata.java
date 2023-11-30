package com.codewars.kyu8.expressionsMatter;

/**
 * <h2>Task</h2>
 * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators
 * and brackets: +, *, ()<br/>
 * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained (Read the notes
 * for more detail about it)
 * <p>
 * <h2>Example</h2>
 * With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
 * <p>
 * 1 * (2 + 3) = 5<br/>
 * 1 * 2 * 3 = 6<br/>
 * 1 + 2 * 3 = 7<br/>
 * (1 + 2) * 3 = 9<br/>
 * So the maximum value that you can obtain is 9.
 * <p>
 * <h2>Notes</h2>
 * The numbers are always positive.<br/>
 * The numbers are in the range (1  ≤  a, b, c  ≤  10).<br/>
 * You can use the same operation more than once.<br/>
 * It's not necessary to place all the signs and brackets.<br/>
 * Repetition in numbers may occur .<br/>
 * You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.<br/>
 * Input >> Output Examples:<br/>
 * expressionsMatter(1,2,3)  ==>  return 9
 * <p>
 * <h2>Explanation:</h2>
 * After placing signs and brackets, the Maximum value obtained from the expression (1+2) * 3 = 9.
 * <p>
 * expressionsMatter(1,1,1)  ==>  return 3
 * <p>
 * <h2>Explanation:</h2>
 * After placing signs, the Maximum value obtained from the expression is 1 + 1 + 1 = 3.
 * <p>
 * expressionsMatter(9,1,1)  ==>  return 18
 * <p>
 * <h2>Explanation:</h2>
 * After placing signs and brackets, the Maximum value obtained from the expression is 9 * (1+1) = 18. ___# Task
 * <p>
 * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators
 * and brackets: +, *, ()<br/>
 * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
 * <p>
 * <h2>Example</h2>
 * With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
 * <p>
 * 1 * (2 + 3) = 5<br/>
 * 1 * 2 * 3 = 6<br/>
 * 1 + 2 * 3 = 7<br/>
 * (1 + 2) * 3 = 9<br/>
 * So the maximum value that you can obtain is 9.
 * <p>
 * <h2>Notes</h2>
 * The numbers are always positive.<br/>
 * The numbers are in the range (1  ≤  a, b, c  ≤  10).<br/>
 * You can use the same operation more than once.<br/>
 * It's not necessary to place all the signs and brackets.<br/>
 * Repetition in numbers may occur .<br/>
 * You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.<br/>
 * Input >> Output Examples:<br/>
 * expressionsMatter(1,2,3)  ==>  return 9
 * <p>
 * <h2>Explanation:</h2>
 * After placing signs and brackets, the Maximum value obtained from the expression (1+2) * 3 = 9.
 * <p>
 * expressionsMatter(1,1,1)  ==>  return 3
 */
public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        int result = a + b + c;
        result = check(result, a * b * c);

        result = check(result, a + b * c);
        result = check(result, a * b + c);


        result = check(result, (a + b) * c);
        result = check(result, a * (b + c));

        return result;
    }

    private static int check(int highest, int candidate) {
        return Math.max(highest, candidate);
    }
}
