public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int number = 0;
        int v = n;
        while (n > 0) {
            int x = n % 10;
            n = n/10;
            if (x != 0) {
              if (v % x == 0){
                number++;
              }
            }
        }
        return number;

    }
}