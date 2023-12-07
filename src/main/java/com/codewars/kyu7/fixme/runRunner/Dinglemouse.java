package com.codewars.kyu7.fixme.runRunner;

/**
 * The code provided is supposed to execute method1 and method2 in different threads.
 * <p>
 * But it's not working properly.
 * <p>
 * Task
 * <p>
 * Fix the bug so we can all go home early.
 * <p>
 * Notes
 * <p>
 * This <a href="https://en.wikipedia.org/wiki/Logan%27s_Run_(TV_series)">link</a> won't help solve this Kata, but it may explain my choice of class names.
 * <p>
 * :-)
 */
public class Dinglemouse {
    private static class Logan5 implements Runnable {
        public void run() {
            System.out.println("Hello from Logan5");
            ThreadUtil.method1();
        }
    }

    private static class Jessica6 implements Runnable {
        public void run() {
            System.out.println("Hello from Jessica6");
            ThreadUtil.method2();
        }
    }

    public static void runRunners() {
        new Thread(new Logan5()).start();
        new Thread(new Jessica6()).start();
    }
}
