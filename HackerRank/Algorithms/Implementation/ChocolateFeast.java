public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int nb_choclate = n/c;
        int wrappers = nb_choclate;
        while (wrappers >= m) {
            wrappers = wrappers-m+1;
          nb_choclate ++;
          
        }
        return nb_choclate;

    }
}