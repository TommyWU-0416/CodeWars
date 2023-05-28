package Strings;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.length() == 0) return null;

        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            /**
             * 原版這邊我使用 X + 1但這樣容易有 indexOutOfBound風險，以及還需要修改多個地方
             */
            if (i == 0 || chars[i-1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }

}