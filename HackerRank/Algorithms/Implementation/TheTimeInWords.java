
public class TheTimeInWords {
    // Complete the timeInWords function below.
    static String timeInWords(int H, int M) {
       HashMap<Integer, String> words = new HashMap<>();
        ///////////////////////////////////////////////////////
        words.put(1,"one");words.put(2,"two");
        words.put(3,"three");words.put(4,"four");
        words.put(5,"five");words.put(6,"six");
        words.put(7,"seven");words.put(8,"eight");
        words.put(9,"nine");words.put(10,"ten");
        words.put(11,"eleven");words.put(12,"twelve");
        
        words.put(13,"thirteen");
        words.put(14,"fourteen");
        words.put(15,"fifteen");
        words.put(16,"sixteen");
        words.put(17,"seventeen");
        words.put(18,"eighteen");
        words.put(19,"nineteen");
        
        ///////////////////////////////////////////////////////
        
        if (M == 0){return words.get(H)+" o' clock";}
        if ((M==1) && (H==1)){return "one minute past one";}
        if(M < 30)
        {
            if(M > 1)
            {
                if(M > 20)
                {return "twenty "+words.get(M-20)+" minutes past "+words.get(H);}
                else if(M == 15)
                {return "quarter past "+words.get(H);}
                else
                {return words.get(M)+" minutes past "+words.get(H);}
            }
            else
            {return words.get(M)+" minute past "+words.get((H+1)%12);}
        }
        else if(M > 30)
        {
            if(M==45)
            {return "quarter to "+words.get((H+1)%12);}
            else if(60-M > 20)
            {return "twenty "+words.get(60-M-20)+" minutes to "+words.get((H+1)%12);}
            else if(60-M < 20){return words.get(60-M)+" minutes to "+words.get((H+1)%12);}
          else{return "twenty minutes to "+words.get((H+1)%12);}
        }
        else
        {return "half past "+words.get(H);}

    }
}
