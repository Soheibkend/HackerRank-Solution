public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int cumulative = 0;
        int nb_person = 5;
        for(int i=1 ; i<=n ; i++) {
            cumulative = cumulative + Math.floorDiv(nb_person, 2);
            nb_person = Math.floorDiv(nb_person, 2) * 3;
        }
        return cumulative;
    }
}