class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
     
    public static boolean isFactor (List<Integer> a , int x) {
        for(int i=0; i<a.size(); i++) {
            if (a.get(i)%x != 0){
                return false;
            }
        }
        return true;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    
      int ans = 0;
        
        for(int j=1;j<=100;j++)
            {
            boolean hh = true;
            for(int bb : b)
                {
                if(bb%j!=0)
                    {
                    hh = false;
                    break;
                }
            }
            
            if(hh)
                {
                 for(int bb : a)
                {
                if(j%bb!=0)
                    {
                    hh = false;
                    break;
                }
            }
                
                if(hh)
                    ans++;
                
            }
        }
        return ans;

    }

}