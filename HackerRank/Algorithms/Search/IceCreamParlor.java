public class IceCreamParlor {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1 ; j<arr.length; j++) {
                if (arr[i]+arr[j] == m){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}