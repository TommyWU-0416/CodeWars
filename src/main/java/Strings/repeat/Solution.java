package Strings.repeat;

/**
 * https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/java
 */
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String repeatString = "";
        int count = 0;

        while (count < repeat) {
            repeatString += string;
            count++;
        }
        return repeatString;
    }
}
