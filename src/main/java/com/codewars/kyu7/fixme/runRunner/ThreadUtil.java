package com.codewars.kyu7.fixme.runRunner;

public class ThreadUtil {

    private static boolean flag;

    public static void method1() {
        flag = true;
    }

    public static void method2() {
        flag = true;
    }

    public static boolean checkThreads() {
        return flag;
    }
}
