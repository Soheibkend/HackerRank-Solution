public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
       long count =0;
       for(int i=0 ; i < s.length(); i++){
           if (s.charAt(i)=='a'){
               count ++;
           }
       }
       long nb = n/s.length();
       count = count * nb;
       if (nb*s.length() < n){
           long m = n%s.length();
           for(int j=0 ; j < m; j++){
               if (s.charAt(j)=='a'){
                   count++;
               }
           }
       }
       return count;
    }
}