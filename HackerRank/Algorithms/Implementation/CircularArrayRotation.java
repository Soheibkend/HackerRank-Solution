public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         k = k % a.length;
         int[] result = new int[queries.length];
         for (int i = 0; i < result.length; i++) {
                result[i] = a[(queries[i] - k + a.length) % a.length];
        }
        return result;
    }
}