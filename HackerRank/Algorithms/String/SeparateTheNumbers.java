public class SeparateTheNumbers {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
          
        String subString = "";
        boolean isValid = false;
        long num=0;
        
        for (int i=1 ; i <= s.length()/2 ; i++){
            subString = s.substring(0,i);
            num = Long.parseLong(subString);
            String validString = subString;
            while (validString.length() < s.length()) {
                validString += Long.toString(++num);
            }
            
            if (validString.equals(s)) {
                isValid= true;
                break;
            }
        }
        if (isValid) {
            System.out.println ("YES "+ subString);
        }
        else{
            System.out.println ("NO");
        }
        

    }
