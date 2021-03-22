package HackerRank.Warmup;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int i=0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }
}
