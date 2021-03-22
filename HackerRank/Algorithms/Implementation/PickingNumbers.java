class PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        List<Integer> sub = new ArrayList<Integer>();
        int count =0;
        
      
      for(int i=0; i<a.size(); i++) {
          
          for(int j=0 ; j<a.size(); j++) {
              if (a.get(i)==a.get(j) || a.get(i)+1 == a.get(j)){
                  count++;
              } 
          }
          sub.add(count);
          count=0;
          
      }
      int max = sub.get(0);
      for(int i=0 ; i<sub.size(); i++) {
          if (max < sub.get(i)){
              max = sub.get(i);
          }
      }
      return max;

    }

}