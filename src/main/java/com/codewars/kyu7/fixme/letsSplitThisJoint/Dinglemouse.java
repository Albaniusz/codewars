package com.codewars.kyu7.fixme.letsSplitThisJoint;

/**
 * The code provided is supposed return an array of items that were separated in the joint string by .
 * <p>
 * But it's not working properly.
 * <p>
 * Notes
 * <ul>
 * <li>A zero length input joint string should yield an empty output array</li>
 * <li>Empty items are preserved</li>
 * </ul>
 * Task
 * <p>
 * Fix the bug so we can all go home early.
 */
public class Dinglemouse {
    public static String[] split(final String joint) {
        return "".equals(joint) ? new String[]{} : joint.split("\\.", -1);
    }
}
