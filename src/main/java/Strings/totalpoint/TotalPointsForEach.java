package Strings.totalpoint;

public class TotalPointsForEach {

    public static int points(String[] games) {
        //implement me
        int count = 0;

        for (String game : games) {
            char scoreX = game.charAt(0);
            char scoreY = game.charAt(2);

            count += scoreX > scoreY ? 3 : scoreX == scoreY ? 1 : 0;
        }

        return count;
    }
}