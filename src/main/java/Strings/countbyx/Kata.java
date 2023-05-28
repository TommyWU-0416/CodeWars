package Strings.countbyx;

/**
 * https://www.codewars.com/kata/5513795bd3fafb56c200049e/java
 */
public class Kata {
    public static int[] countBy(int x, int n) {
        // Your code here
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = x + i * x;
        }
        return ints;
    }
}