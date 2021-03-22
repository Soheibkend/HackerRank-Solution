package HackerRank.Warmup;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int n = arr.length;
        for(int i = 0; i<arr.length; i++){
            positive += arr[i]>0 ? 1:0;
            negative += arr[i]<0 ? 1:0;
            zero += arr[i]==0 ? 1:0;
        }
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);
    }
}
