package HackerRank.Warmup;

public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        for(int i=0; i<5; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        long minSum = sum - max;//Removes the largest of the 5 numbers to get the min sum
        long maxSum = sum - min;//Removes the smallest of the 5 numbers to get the max sum
        System.out.println(minSum + " " + maxSum);
    }
}
