public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int m=0;
        for(int i=0 ; i<p.length ; i++) {
            int x = i+1;
            for(int j=0 ; j<p.length; j++) {
                    if (x == p[j]) {
                        for(int k=0 ; k<p.length ; k++) {
                            if (p[k] == j+1){
                                result[m] = k+1;
                                m++;
                            }
                        }
                    }
            }
        }
        
        return result;
    }
}