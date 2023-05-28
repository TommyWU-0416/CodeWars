package Strings.totalpoint;

import java.util.Arrays;

public class TotalPointsStream {
    public static void points(String[] games) {
        Arrays.stream(games)
                .mapToInt(score -> score.charAt(0) - score.charAt(2))
                .map(compare -> compare > 0 ? 3 : compare == 0 ? 1 : 0)
                .sum();
    }

    public static void main(String[] args) {
        String[] games = {"5:1", "4:2"};
        points(games);
    }
}
