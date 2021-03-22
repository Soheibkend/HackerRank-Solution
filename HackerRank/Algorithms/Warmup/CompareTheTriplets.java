package HackerRank.Warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int bob_score = 0;
        int alice_score = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice_score++;
            } else if (b.get(i) > a.get(i)) {
                bob_score++;
            }

        }
        List<Integer> score = new ArrayList<Integer>(2);
        score.add(alice_score);
        score.add(bob_score);
        return score;
    }
}
