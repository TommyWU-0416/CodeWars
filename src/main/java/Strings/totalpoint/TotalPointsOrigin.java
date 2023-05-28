package Strings.totalpoint;

/**
 * https://www.codewars.com/kata/5bb904724c47249b10000131
 */
public class TotalPointsOrigin {

    public static int points(String[] games) {
        //implement me
        if (null == games || games.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < games.length; i++) {
            String[] compare = games[i].split(":");
            int scoreX = Integer.valueOf(compare[0]);
            int scoreY = Integer.valueOf(compare[1]);

            if (scoreX > scoreY) {
                count += 3;
            } else if (scoreX < scoreY) {
                count += 0;
            } else if (scoreX == scoreY) {
                count += 1;
            }
        }
        return count;
    }
}