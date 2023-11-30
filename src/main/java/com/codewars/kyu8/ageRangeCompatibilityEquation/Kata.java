package com.codewars.kyu8.ageRangeCompatibilityEquation;

/**
 * Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow (including myself). It's the 'recommended' age range in which to date someone.
 * <p>
 * <img src="https://web.archive.org/web/20190206114947if_/http://weknowmemes.com/wp-content/uploads/2014/08/age-range-compatibility-equation.jpg"/>
 * <p>
 * minimum age <= your age <= maximum age
 * <p>
 * <b>Task</b>
 * <p>
 * Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.
 * <p>
 * This equation doesn't work when the age <= 14, so use this equation instead:
 * <p>
 * min = age - 0.10 * age<br/>
 * max = age + 0.10 * age<br/>
 * You should floor all your answers so that an integer is given instead of a float (which doesn't represent age). Return your answer in the form [min]-[max]
 * <p>
 * <b>Examples:</b>
 * <p>
 * age = 27   =>   20-40<br/>
 * age = 5    =>   4-5<br/>
 * age = 17   =>   15-20
 */
public class Kata {
    public static String datingRange(int age) {
        int min, max;
        if (age <= 14) {
            min = (int) (age - 0.1 * age);
            max = (int) (age + 0.1 * age);
        } else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }

        return String.format("%d-%d", min, max);
    }
}
