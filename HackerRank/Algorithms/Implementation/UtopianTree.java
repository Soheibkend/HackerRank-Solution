public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int height =1;
        for (int i=0 ; i<n ; i++) {
            if (i%2 == 0) {
                height = height*2;
            }
            else {
                height++;
            }
        }
        
        return height;

    }

}