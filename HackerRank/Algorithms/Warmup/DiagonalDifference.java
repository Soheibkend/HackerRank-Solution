package HackerRank.Warmup;

import java.util.List;


public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftd=0;
        int rightd=0;
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            leftd+=arr.get(i).get(i);
            rightd+=arr.get(i).get(n-i-1);
        }
        int absd=Math.abs(leftd-rightd);
        return absd;


    }

}
