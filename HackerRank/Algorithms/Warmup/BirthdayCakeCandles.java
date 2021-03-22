package HackerRank.Warmup;

import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0), count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
            }
        }

        for (int i = 0; i < candles.size(); i++) {
            if (max == candles.get(i)) {
                count++;
            }
        }
        return count;

    }

}
