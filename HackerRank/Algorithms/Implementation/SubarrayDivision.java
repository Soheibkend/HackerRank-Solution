public class SubarrayDivision {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
      
      int sum_sub = 0;
      int count = 0;
      for (int i = 0 ; i < s.size() ; i++) {
          if (i+m <= s.size()) {
              sum_sub = 0;
              for (int j=i ; j < i+m ; j++) {
                  sum_sub += s.get(j);
              }
              if (sum_sub == d){
                  count++;
              }
          }
      }
      
      return count;

    }
}