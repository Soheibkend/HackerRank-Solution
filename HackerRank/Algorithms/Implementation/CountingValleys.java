class CountingValleys {

    
    public static int countingValleys(int steps, String path) {
    int depth = 0;
    int nb_valley = 0;
      for (int i=0 ; i < steps ; i++) {
          if (path.charAt(i) == 'D') {
              depth--;
           }
          else {
              depth++;
           }
           if  ((depth == 0) && (path.charAt(i) == 'U')) {
               nb_valley++;
           }
        }
        
        return nb_valley;
        
    }

}
