package HackerRank.Warmup;

public class Staircase {
    static void staircase(int n) {
        StringBuilder stair = new StringBuilder("");
        for(int i = 0; i < n; i++) {
            stair.append(" ");
        }

        for(int i = 1; i< n+1; i++) {
            stair.setCharAt(n-i,'#');
            System.out.println(stair);
        }
    }
}
