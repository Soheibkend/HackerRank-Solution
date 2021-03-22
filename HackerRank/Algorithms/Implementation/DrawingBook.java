public class Solution {

    
    static int pageCount(int n, int p) {
        int total_flip = n/2;
        int front_flip = p/2;
        int left_flip = total_flip - front_flip;
        if (front_flip < left_flip) {
            return front_flip;
        }
        else {
            return left_flip;
        }   
    }
}