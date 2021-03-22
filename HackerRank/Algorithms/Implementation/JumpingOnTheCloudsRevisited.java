public class jumpingOnCloudsRevisited {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int i=0;
        int energy = 100;
        boolean p = true;
        while (p){
            if (c[(i+k)%(c.length)] == 1) {
                energy = energy - 3;
            }
            else {
                energy = energy -1;
            }
            i = i+k;
            if (i%c.length== 0){
               p = false;
            }
        }
        return energy;
    }
}