public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
       
       int accepted_student = 0;
       for(int i=0 ; i < a.length ; i++){
           if (a[i]<=0) {
               accepted_student ++;
           }
       }
       if (accepted_student >= k) {
           return "NO";
       }
       return "YES";

    }
}