public class EqualizeTheArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int max =0;
        int count = 0;
        for(int i=0 ; i < arr.length; i++) {
            count = 1;
            for(int j=0; j < arr.length; j++){
                if (i != j){
                    if (arr[i] == arr[j]){
                        count++;
                    }
                }
            }
            if (count > max) {
                max = count ;
            }
        }
        return arr.length-(max); 
    }
}