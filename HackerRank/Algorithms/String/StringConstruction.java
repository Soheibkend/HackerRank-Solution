public class StringConstruction {

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        int cost =0;
        Set<Character> hashSet = new HashSet<Character>();
        for(int i=0;i<s.length();i++) {
            if (!hashSet.contains(s.charAt(i))){
                hashSet.add(s.charAt(i));
                cost++;
            }
        }
        return cost;
    }
}