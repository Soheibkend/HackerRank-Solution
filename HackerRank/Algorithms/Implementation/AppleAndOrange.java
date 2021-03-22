public class AppleAndOrange {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int sum_apples = 0;
        int sum_oranges = 0;
        for (int i = 0 ; i < apples.length ; i++) {
           if ((apples[i]+a <= t) && (apples[i]+a >= s)) {
               sum_apples++;
           }
        }
       
        for (int i = 0 ; i < oranges.length ; i++) {
           if ((oranges[i]+b <= t) && (oranges[i]+b >= s)) {
               sum_oranges++;
           }
        }
       System.out.println (sum_apples);
       System.out.println (sum_oranges);

    }
}