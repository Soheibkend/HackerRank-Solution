public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
       
       int[] count = {0,0,0,0,0};
       int max_idx=0 ;
       
             
        for (int i=0 ; i< arr.size() ; i++) {
          count[arr.get(i)-1] += 1;
        } 
        
        int max = count[0];
        
        for(int i=1 ; i < count.length ;i++ ){
            if (count[i] > max) {
                max_idx= i;
                max = count[i];
            }
            else if (count[i] == max){
                if (i < max_idx) {
                    max_idx = i;
                }
            }
        } 
        return max_idx+1;
             
    }
}
