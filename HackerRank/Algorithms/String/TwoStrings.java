public class twoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
       
      HashSet<Character> s1_char = new HashSet();
      HashSet<Character> s2_char = new HashSet();
      
      for(int i=0; i<s1.length(); i++) {
          s1_char.add(s1.charAt(i));
      }
      
      for(int i=0; i<s2.length(); i++) {
          s2_char.add(s2.charAt(i));
      }
      
      s1_char.retainAll(s2_char);
      if(!s1_char.isEmpty()){
          return "YES";
      }
      return "NO";

    }
}