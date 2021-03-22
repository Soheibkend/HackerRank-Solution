public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max_sum = 0;
        int sum = 0;
        
        for (int i = 0 ; i < keyboards.length ; i++) {
            for (int j = 0 ; j < drives.length ; j++) {
                if (keyboards[i] + drives[j] == b) {
                    return b;
                }
                else if (keyboards[i]+drives[j] < b) {
                    sum = keyboards[i] + drives [j];
                    if (max_sum < sum) {
                        max_sum = sum;
                    }
                }
                
            }
        }
        
        if (max_sum == 0) {
            return -1;
        }
        else {
            return max_sum;
        }

    }
}