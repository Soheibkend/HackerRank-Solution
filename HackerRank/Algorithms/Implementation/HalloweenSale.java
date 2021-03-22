public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        int numberGames = 0;
        int cost = 0;
        if (s > p){
            
        while ((p > m) && cost <= s){
            cost = cost + p;
            p = p - d;
            numberGames++;
            
        }
        while (cost <= s){
            cost = cost + m;
            numberGames++;
        }
        
        return numberGames-1;
        } else{
            return 0;
        }
    } 

    
}