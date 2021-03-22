public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
     
        if (s.length() + t.length() < k) {
            return "Yes";
        }
        // Iterate through string matching characters
        int i = -1;
        while(i++ < Math.min(s.length(), t.length()) - 1) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        // The strings are the same
        if (i == s.length() && s.length() == t.length()) {
            // if k is odd, there will always be 1 operation left over
            // else, you can delete and re-append last character to use up k operations
            return ((k & 1) == 1) ? "No" : "Yes";
        }
        // Else
        // Reduce k by number of necessary deletions and insertions
        k = k - (s.length() - i) - (t.length() - i);
        // If k < 0 or there is an odd number of operations left over, false
        // else we need exactly k operations or the number of extra ops is even, true
        return (k < 0 || (k & 1) == 1) ? "No" : "Yes";
        
      
    }
