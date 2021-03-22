public class BreakingtheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
       int highest_score = scores[0];
       int lowest_score = scores[0];
       int[] result = new int [2];
       int nb1 = 0;
       int nb2 = 0;
       for (int i = 1; i < scores.length ; i++) {
           if (scores[i] > highest_score) {
               nb1 ++;
               highest_score = scores[i];
           }
           if (scores[i]<lowest_score) {
               nb2 ++;
               lowest_score = scores[i];
           }
       }
       result[0] = nb1;
       result[1] = nb2;
       return result;
       
    }
}