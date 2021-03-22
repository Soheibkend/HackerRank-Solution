public class SalesByMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
       int sum_pairs = 0;
       for (int i=0 ; i < n-1 ; i++) {
           for (int j = i+1 ; j < n ; j++) {
               if (ar[i]==ar[j] && ar[i] != 0) {
                   sum_pairs++;
                   ar[i] =0;
                   ar[j] =0;
                   break;
               }
           }
       }
       return sum_pairs;

    }
}
