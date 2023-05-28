package Strings.jadecase;

/**
 * https://www.codewars.com/kata/5390bac347d09b7da40006f6
 */
public class JadenCaseOrigin {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        char[] c = new char[phrase.length()];
        phrase.getChars(0, phrase.length(), c, 0);

        c[0] = String.valueOf(c[0]).toUpperCase().charAt(0);

        for (int i = 1; i < phrase.length(); i++) {
            if (" ".equals(String.valueOf(c[i]))) {
                String toUpperCase = String.valueOf(c[i + 1]);
                c[i + 1] = toUpperCase.toUpperCase().charAt(0);
                i++;
            }
        }
        return String.valueOf(c);
    }

}