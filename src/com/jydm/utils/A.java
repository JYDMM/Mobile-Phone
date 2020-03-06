package com.jydm.utils;

public class A {

    /* -------- 1D Array --------*/
    public static <E> void printArray(E[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }

    public static void printArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(String[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(int[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(double[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(long[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(long[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(short[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(short[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(char[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(byte[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(i + " " + input[i]);
        }
    }
    public static void printArray(byte[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }
    public static void printArray(boolean[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(i + " " + input[i]);
        }
    }
    public static void printArray(boolean[] input, boolean printIndex) {
        for (int i = 0; i < input.length; i++) {
            if (printIndex) {
                System.out.println("[" + i + "] " + input[i]);
            } else {
                System.out.println(input[i]);
            }
        }
    }

    /* -------- 2D Array ------ */

    public static void printArray(String[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(double[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(long[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(short[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(char[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(byte[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(boolean[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
            System.out.println();
        }
    }
}
