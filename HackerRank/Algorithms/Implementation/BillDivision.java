public class BillDivision {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
      int sum = 0;
      for( int i = 0 ; i < bill.size() ; i++) {
          if (i != k){
              sum+= bill.get(i);
          }
      } 
      sum = sum / 2;
      if (sum == b) {
          System.out.println ("Bon Appetit");
      }
      else {
          System.out.println (b-sum);
      }

    }
}