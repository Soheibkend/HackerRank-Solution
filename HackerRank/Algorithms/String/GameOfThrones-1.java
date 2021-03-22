public class GameOfThrones1 {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        
        Map<Character, Integer> letters = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(letters.containsKey(c))
                letters.put(c, letters.get(c) + 1);
            else
                letters.put(c, 1);
        }
        
        int odd = 0;
        int even = 0;
        for(Integer frequency : letters.values())
        {
            if(frequency % 2 == 1)
            {
                odd++;
                continue;
            }
                
            if(frequency % 2 == 0)
                even++;
        }
        
        if(odd > 1) 
            return "NO";
        else
            return "YES";
        
    }
}
