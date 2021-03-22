public class SaveThePrisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int position = s;
        for(int i=1 ; i<=m ; i++){
            position = position +1 ;
        }
        if ((position-1) % n == 0){
            return n;
        }  
        if (position-1 == 0){
            return 1;
        }
        return (position-1)%n;
    }
}