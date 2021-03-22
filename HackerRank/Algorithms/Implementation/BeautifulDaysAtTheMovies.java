public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
       
       int beautiful_count = 0;
       for( int m = i ; m <= j ; m++) {
           String str = String.valueOf(m);
           StringBuilder sb = new StringBuilder(str);
           int reverse = Integer.valueOf(sb.reverse().toString());
           if ((m-reverse)%k == 0) {
               beautiful_count ++;
           }
       } 
       return beautiful_count ;

    }
}