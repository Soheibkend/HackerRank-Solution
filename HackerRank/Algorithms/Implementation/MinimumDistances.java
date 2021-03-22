public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
       int min = 111111;
       int x = 0;
       for(int i=0 ; i<a.length ; i++) {
           for(int j=0; j<a.length-1; j++){
               if (i != j){
                   if (a[i]==a[j]){
                       x = Math.abs(j-i);
                       if (x < min){
                       min = x;
                   }
                   }
               }
           }
       }
       if (min == 111111){
           return -1;
       }
       return min;

    }
}